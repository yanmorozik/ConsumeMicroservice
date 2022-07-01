package eu.morozik.microservice.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {
    public static final String QUEUE = "queue";

    @RabbitListener(queues = QUEUE)
    public void consume(String msg) {
        log.info("Consume: " + msg);
    }
}
