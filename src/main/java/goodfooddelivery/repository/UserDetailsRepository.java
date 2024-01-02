package goodfooddelivery.repository;
import goodfooddelivery.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
    void deleteByUserAuthId(Long userAuthId);
    Optional<UserDetails> findByUserAuthId(Long userAuthId);
}
