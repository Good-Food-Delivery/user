package goodfooddelivery.controller;

import goodfooddelivery.dto.request.UserCreateRequestDTO;
import goodfooddelivery.dto.response.MessageResponseDTO;
import goodfooddelivery.interfaces.IUserService;
import goodfooddelivery.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<MessageResponseDTO> createUser(@RequestBody UserCreateRequestDTO user)
    {
        try {
            userService.saveUser(UserMapper.INSTANCE.toUser(user));
            return ResponseEntity.ok(new MessageResponseDTO("Account has successfully been created"));
        }
        catch(IllegalArgumentException e)
        {
            return new ResponseEntity(new MessageResponseDTO(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
