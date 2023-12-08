package goodfooddelivery.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "UserDetails")
@Data
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserDetailsID")
    private Long userDetailsId;
    @Column(name = "UserAuthID")
    private Long userAuthId;
    @Column(name = "Address")
    private String address;
    @Column(name = "PostalCode")
    private String postalCode;
    @Column(name = "City")
    private String city;
    @Column(name = "PhoneNumber")
    private String phoneNumber;

    public Long getUserDetailsId() {
        return userDetailsId;
    }

    public void setUserDetailsId(Long userDetailsId) {
        this.userDetailsId = userDetailsId;
    }

    public Long getUserAuthId() {
        return userAuthId;
    }

    public void setUserAuthId(Long userAuthId) {
        this.userAuthId = userAuthId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

