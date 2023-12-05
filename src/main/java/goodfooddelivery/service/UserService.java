package goodfooddelivery.service;

import goodfooddelivery.interfaces.IUserService;
import goodfooddelivery.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import goodfooddelivery.repository.UserRepository;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public String saveUser(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User added to the system";
    }

}
