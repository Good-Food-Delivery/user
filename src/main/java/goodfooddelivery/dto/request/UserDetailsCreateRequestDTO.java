package goodfooddelivery.dto.request;
import lombok.Data;

@Data
public class UserDetailsCreateRequestDTO {

    private String address;
    private String postalCode;
    private String city;
    private String phoneNumber;

}
