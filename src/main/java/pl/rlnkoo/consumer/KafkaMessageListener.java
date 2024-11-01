package pl.rlnkoo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import pl.rlnkoo.dto.Customer;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "rlNkoo-new-topic1", groupId = "rlnkoo-group")
    public void consume(Customer customer){
        log.info("consumer consume the event {} ", customer.toString());
    }
}
