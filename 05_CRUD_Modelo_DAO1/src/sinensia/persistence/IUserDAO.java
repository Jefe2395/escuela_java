package sinensia.persistence;

import java.util.List;
import sinensia.model.User;



/**
 *
 * @author Jaime Palomo
 */
public interface IUserDAO {
    User create(User user);
    List<User> getAll();
    boolean remove(int id);
    boolean remove(User user);
}
