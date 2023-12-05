package goodfooddelivery.mapper;

import goodfooddelivery.dto.response.RestaurantResponseDTO;
import goodfooddelivery.model.Restaurant;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-01T15:47:52+0100",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.3.jar, environment: Java 17.0.7 (Oracle Corporation)"
)
public class RestaurantMapperImpl implements RestaurantMapper {

    @Override
    public RestaurantResponseDTO toVideoResponseDTO(Restaurant restaurant) {
        if ( restaurant == null ) {
            return null;
        }

        RestaurantResponseDTO restaurantResponseDTO = new RestaurantResponseDTO();

        restaurantResponseDTO.setRestaurantId( restaurant.getRestaurantId() );
        restaurantResponseDTO.setName( restaurant.getName() );
        restaurantResponseDTO.setDescription( restaurant.getDescription() );

        return restaurantResponseDTO;
    }
}
