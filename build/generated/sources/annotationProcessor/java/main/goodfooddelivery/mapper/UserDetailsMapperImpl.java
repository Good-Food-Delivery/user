package goodfooddelivery.mapper;

import goodfooddelivery.dto.request.UserDetailsCreateRequestDTO;
import goodfooddelivery.model.UserDetails;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-08T17:48:49+0100",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.3.jar, environment: Java 17.0.7 (Oracle Corporation)"
)
public class UserDetailsMapperImpl implements UserDetailsMapper {

    @Override
    public UserDetails toUserDetails(UserDetailsCreateRequestDTO user) {
        if ( user == null ) {
            return null;
        }

        UserDetails userDetails = new UserDetails();

        userDetails.setAddress( user.getAddress() );
        userDetails.setPostalCode( user.getPostalCode() );
        userDetails.setCity( user.getCity() );
        userDetails.setPhoneNumber( user.getPhoneNumber() );

        return userDetails;
    }
}
