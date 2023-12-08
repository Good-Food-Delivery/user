package goodfooddelivery.mapper;
import goodfooddelivery.dto.request.UserDetailsCreateRequestDTO;
import goodfooddelivery.model.UserDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDetailsMapper {
    UserDetailsMapper INSTANCE = Mappers.getMapper(UserDetailsMapper.class);

    UserDetails toUserDetails(UserDetailsCreateRequestDTO user);

}