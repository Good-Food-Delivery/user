package goodfooddelivery.mapper;
import goodfooddelivery.dto.request.UserCreateRequestDTO;
import goodfooddelivery.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toUser(UserCreateRequestDTO user);

}