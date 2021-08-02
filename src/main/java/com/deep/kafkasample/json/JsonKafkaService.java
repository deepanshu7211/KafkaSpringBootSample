package com.deep.kafkasample.json;

import com.deep.kafkasample.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaService {

    @Autowired
    KafkaTemplate<String,Object> kafkaTemplate;

    @Autowired
    AppConfiguration appConfiguration;

    public void publishJsonMessage(Person person){
        System.out.println(" person Object publish " + person);
        kafkaTemplate.send(appConfiguration.getJsonTopic(),person);
    }
}
