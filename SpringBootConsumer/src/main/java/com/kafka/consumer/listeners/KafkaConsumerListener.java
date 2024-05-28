package com.kafka.consumer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {

  private Logger logger = LoggerFactory.getLogger(KafkaConsumerListener.class);

  @KafkaListener(topics = "prueba-topic", groupId = "group_id")
  public void listen(String message) {
    logger.info("Mensaje recibido:  " + message);
  }

}