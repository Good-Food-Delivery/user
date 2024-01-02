package goodfooddelivery;

import goodfooddelivery.config.MQConfig;
import goodfooddelivery.dto.response.UserMessage;
import goodfooddelivery.interfaces.IUserDetailsService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessageListener {

    @Autowired
    private IUserDetailsService userDetailsService;

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(UserMessage userMessage) {

        Long userAuthId = userMessage.getUserAuthId();
        String action = userMessage.getAction();

        System.out.println("Received userAuthId: " + userAuthId + "with action: " + action);

        switch (action)
        {
            case "CREATE":
                userDetailsService.createUserDetailsWithUserAuthId(userAuthId);
                break;
            case "DELETE":
                userDetailsService.deleteUserDetailsWithUserAuthId(userAuthId);
        }
    }
}
