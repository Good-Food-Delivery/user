package goodfooddelivery.interfaces;

import goodfooddelivery.model.UserDetails;

public interface IUserDetailsService {
    public String saveUserDetails(UserDetails user);
}
