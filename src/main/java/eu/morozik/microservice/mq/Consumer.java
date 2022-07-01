package eu.morozik.microservice.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {
    @RabbitListener(queues = "queue")
    public void consume(String msg){
        log.info("Consume: "+ msg);
    }
}
