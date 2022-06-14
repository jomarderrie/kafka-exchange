package com.exchange.kafkaexchange.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaTopicConfig {
    @Bean
    fun exchangeTopic(): NewTopic {
        return TopicBuilder.name("exchange").build()
    }
}
