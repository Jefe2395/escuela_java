package sinensia.persistence;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sinensia.model.User;

/**
 * @author Jaime Palomo
 */
public class UserDAO_DerbyDB implements IUserDAO {

    private static final String CONEX_DB = "jdbc:derby://localhost:1527/db_user";
    private static final String USER_DB = "root";
    private static final String PWD_DB = "1234";

    public UserDAO_DerbyDB() {
        try {
            //Cargamos el driver de Derby DB. Esta basado en JDBC
            //Una implementación de JDBC para Java
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception ex) {
            Logger.getLogger(UserDAO_DerbyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User create(User user) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(CONEX_DB, USER_DB, PWD_DB);
            /*String sqlQuery = "INSERT INTO users (email,password,name,age) VALUES ("
                    + " '" + user.getEmail()
                    + "', '" + user.getPassword()
                    + "', '" + user.getNombre()
                    + "', " + user.getAge() + ")";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sqlQuery);*/
            // Los ? son los parametros de las sentencia SQL. Evitamos SQL injection.
            String sqlQuery = "INSERT INTO users (email,password,name,age) VALUES (?,?,?,?)";
            PreparedStatement prepStmt= con.prepareCall(sqlQuery);
            prepStmt.setString(1, user.getEmail());
            prepStmt.setString(2, user.getPassword());
            prepStmt.setString(3, user.getNombre());
            prepStmt.setInt(4, user.getAge());
            prepStmt.executeUpdate();
            con.close();
            return user;
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.getMessage());
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        try (Connection con = DriverManager.getConnection(CONEX_DB, USER_DB, PWD_DB)) {
            ArrayList<User> usersList = new ArrayList<User>();
            String sqlQuery = "Select id,email,password,name,age FROM users";
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(sqlQuery);
            while (res.next()) {
                int id = res.getInt("id");
                String email = res.getString("email");
                String password = res.getString("password");
                String name = res.getString("name");
                int age = res.getInt("age");

                User newUser = new User(email, password, name, age);
                newUser.setId(id);
                usersList.add(newUser);
            }
            return usersList;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());

        }
        return null;
    }

}
