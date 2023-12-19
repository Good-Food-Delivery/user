package goodfooddelivery.service;
import goodfooddelivery.interfaces.IUserDetailsService;
import goodfooddelivery.model.UserDetails;
import goodfooddelivery.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements IUserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public void createUserDetailsWithUserAuthId(Long userAuthId)
    {
        UserDetails user = new UserDetails();
        user.setUserAuthId(userAuthId);
        userDetailsRepository.save(user);
    }

}
