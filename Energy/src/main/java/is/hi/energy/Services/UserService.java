package is.hi.energy.Services;

import is.hi.energy.Persistence.Entities.User;

import java.util.List;

// Service class for User related methods.
public interface UserService {
    User save(User user);
    void delete(User user);
    List<User> findAll();
    User findByUsername(String username);
    User login(User user);
}
