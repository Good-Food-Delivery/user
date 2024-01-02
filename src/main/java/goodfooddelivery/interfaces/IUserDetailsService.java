package goodfooddelivery.interfaces;


public interface IUserDetailsService {
    public void createUserDetailsWithUserAuthId(Long userAuthId);
    public void deleteUserDetailsWithUserAuthId(Long userAuthId);
}
