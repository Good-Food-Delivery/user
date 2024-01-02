package goodfooddelivery.controller;
import goodfooddelivery.dto.request.UserDetailsCreateRequestDTO;
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
}
