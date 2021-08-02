package com.deep.kafkasample.json;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumerService {

    public static final String TOPIC_NAME = "json_topic";
    public static final String GROUP_ID = "json_group_id";

    @KafkaListener(topics = TOPIC_NAME,groupId = GROUP_ID)
    public void consumeJsonMessage(Person person){
        System.out.println(" json Message consumed " + person);
    }

}
