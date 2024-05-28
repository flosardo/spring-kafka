package com.kafka.producer.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

  @Bean
  public NewTopic generateTopic() {
    Map<String, String> topicConfig = new HashMap<>();
    topicConfig.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
    topicConfig.put(TopicConfig.RETENTION_MS_CONFIG, "86400000"); // 1 dia
    topicConfig.put(TopicConfig.RETENTION_BYTES_CONFIG, "1000000000"); // 1GB

    return TopicBuilder.name("prueba-topic").partitions(1)
        .replicas(1).configs(topicConfig).build();
  }

}
