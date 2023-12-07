package goodfooddelivery.mapper;

import goodfooddelivery.dto.request.UserCreateRequestDTO;
import goodfooddelivery.model.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-07T14:22:38+0100",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.3.jar, environment: Java 17.0.9 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserCreateRequestDTO user) {
        if ( user == null ) {
            return null;
        }

        User user1 = new User();

        user1.setName( user.getName() );
        user1.setEmail( user.getEmail() );
        user1.setPassword( user.getPassword() );
        user1.setIsRestaurantOwner( user.getIsRestaurantOwner() );

        return user1;
    }
}
