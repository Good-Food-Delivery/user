package goodfooddelivery.repository;
import goodfooddelivery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
