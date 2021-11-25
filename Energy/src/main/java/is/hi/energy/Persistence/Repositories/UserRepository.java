package is.hi.energy.Persistence.Repositories;

import is.hi.energy.Persistence.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // Method for users to signup,
    // and methods for admins to work with user data.
    User save(User user);
    void delete(User user);
    List<User> findAll();
    User findByUsername(String username);
}
