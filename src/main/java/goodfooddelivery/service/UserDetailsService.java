package goodfooddelivery.service;
import goodfooddelivery.interfaces.IUserDetailsService;
import goodfooddelivery.model.UserDetails;
import goodfooddelivery.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements IUserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String saveUserDetails(UserDetails user)
    {
        return null;
    }

}
