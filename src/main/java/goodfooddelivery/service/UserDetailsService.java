package goodfooddelivery.service;
import goodfooddelivery.interfaces.IUserDetailsService;
import goodfooddelivery.model.UserDetails;
import goodfooddelivery.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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

    @Transactional
    public void deleteUserDetailsWithUserAuthId(Long userAuthId)
    {
        Optional<UserDetails> user = userDetailsRepository.findByUserAuthId(userAuthId);
        if(user.isPresent()) {
            userDetailsRepository.deleteByUserAuthId(userAuthId);
        }
    }

}
