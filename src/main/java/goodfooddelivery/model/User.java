package goodfooddelivery.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "User")
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    private Long userId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name = "IsRestaurantOwner")
    private Boolean isRestaurantOwner;
    @Column(name = "IsAdmin")
    private Boolean isAdmin = false;



    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRestaurantOwner() {
        return isRestaurantOwner;
    }

    public void setRestaurantOwner(Boolean restaurantOwner) {
        isRestaurantOwner = restaurantOwner;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}

