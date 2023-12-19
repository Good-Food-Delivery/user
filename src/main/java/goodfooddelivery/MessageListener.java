package goodfooddelivery;

import goodfooddelivery.config.MQConfig;
import goodfooddelivery.interfaces.IUserDetailsService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessageListener {

    @Autowired
    private IUserDetailsService userDetailsService;

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(Long userAuthId) {
        System.out.println("Received userAuthId: " + userAuthId);
        // Invoke the UserService method to create a user or perform actions with the received userAuthId
        userDetailsService.createUserDetailsWithUserAuthId(userAuthId);
        // Or perform other necessary actions with the received userAuthId
    }
}
