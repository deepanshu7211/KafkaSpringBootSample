package com.deep.kafkasample.basics;

import com.deep.kafkasample.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    public static final String TOPIC_NAME = "test_topic";
    public static final String GROUP_ID = "my_group_id";

    @Autowired
    AppConfiguration appConfiguration;

    @KafkaListener(topics = TOPIC_NAME,groupId = GROUP_ID)
    public void consumeMessage(String message){
        System.out.println(" Message consumed " + message);
    }
}
