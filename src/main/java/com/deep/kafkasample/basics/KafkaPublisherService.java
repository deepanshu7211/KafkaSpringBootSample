package com.deep.kafkasample.basics;

import com.deep.kafkasample.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublisherService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    AppConfiguration appConfiguration;

    public void publishMessage(String message){
        System.out.println(" Message is published " + message);
        kafkaTemplate.send(appConfiguration.getTestTopic(),message);
    }


}
