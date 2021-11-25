package is.hi.energy.Persistence.Entities;

import javax.persistence.*;
import java.util.ArrayList;

// Entity class for each user on the website.
// containing their information and role (Admin/User) otherwise they are a "guest".
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String username;
    private String password;
    private String email;
    private String hasRole;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//    List<Cart> userCart = new ArrayList<>();

    public User(String username, String password, String email, String hasRole) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.hasRole = hasRole;
    }

    // Getters & setters

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHasRole() {return hasRole;}

    public void setHasRole(String hasRole) {this.hasRole = hasRole; }
}
