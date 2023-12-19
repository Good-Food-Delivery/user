package goodfooddelivery.controller;
import goodfooddelivery.dto.request.UserDetailsCreateRequestDTO;
import goodfooddelivery.dto.response.MessageResponseDTO;
import goodfooddelivery.interfaces.IUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserDetailsController {

    @Autowired
    private IUserDetailsService userDetailsService;

    @PostMapping("/register")
    public ResponseEntity<MessageResponseDTO> createUserDetails(@RequestBody UserDetailsCreateRequestDTO user)
    {
//        try {
//            userDetailsService.saveUserDetails(UserDetailsMapper.INSTANCE.toUserDetails(user));
//            return ResponseEntity.ok(new MessageResponseDTO("Account has successfully been created"));
//        }
//        catch(IllegalArgumentException e)
//        {
//            return new ResponseEntity(new MessageResponseDTO(e.getMessage()), HttpStatus.BAD_REQUEST);
//        }
        return null;
    }
}
