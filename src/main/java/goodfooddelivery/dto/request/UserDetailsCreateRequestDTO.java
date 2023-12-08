package goodfooddelivery.dto.request;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserDetailsCreateRequestDTO {

    @Column(name = "Address")
    private String address;
    @Column(name = "PostalCode")
    private String postalCode;
    @Column(name = "City")
    private String city;
    @Column(name = "PhoneNumber")
    private String phoneNumber;

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
