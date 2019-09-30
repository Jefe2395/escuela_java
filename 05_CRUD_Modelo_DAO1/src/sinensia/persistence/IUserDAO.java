package sinensia.persistence;

import java.sql.SQLException;
import java.util.List;
import sinensia.model.User;



/**
 * Interfaz DAO para gestión de usuarios. todas las sentencias pueden lanzar SQLException
 * @author Jaime Palomo
 */
public interface IUserDAO {
    User create(User user) throws SQLException;
    User getByEmail(String email) throws SQLException;
    List<User> getAll() throws SQLException;
    boolean remove(int id) throws SQLException;
    boolean remove(User user)throws SQLException;
}
