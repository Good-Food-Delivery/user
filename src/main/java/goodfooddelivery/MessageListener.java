package goodfooddelivery;

import goodfooddelivery.config.MQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(Long userAuthId)
    {
        System.out.println(userAuthId);
    }
}
