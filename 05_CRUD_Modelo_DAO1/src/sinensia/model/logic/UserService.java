package sinensia.model.logic;

import java.util.List;
import sinensia.model.User;
import sinensia.persistence.IUserDAO;
import sinensia.persistence.UserDAO_DerbyDB;

/**
 * @author Jaime Palomo
 */
public class UserService {

    IUserDAO daoUser;

    public UserService() {
        daoUser = new UserDAO_DerbyDB();
    }

    public UserService(IUserDAO daoUser) {
        this.daoUser = daoUser;
    }

    public User create(String email, String password, String name, int age) {
        User u = null;
        if (email != null && password != null && name != null) {
            if (email.length() > 3 && !password.equals("") && !name.equals("") && age > 0) {
                u = new User(email, password, name, age);
                u = daoUser.create(u);
            }
        }
        return u;
    }

    public List<User> getAll() {
        return daoUser.getAll();
    }
}
