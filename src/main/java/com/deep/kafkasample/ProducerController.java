package com.deep.kafkasample;

import com.deep.kafkasample.basics.KafkaPublisherService;
import com.deep.kafkasample.json.JsonKafkaService;
import com.deep.kafkasample.json.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class ProducerController {

    @Autowired
    KafkaPublisherService kafkaPublisherService;

    @Autowired
    JsonKafkaService jsonKafkaService;

    @GetMapping("/{message}")
    public void publishMessage(@PathVariable String message){
        kafkaPublisherService.publishMessage(message);

    }

    @PostMapping
    public void publishJsonMessage(@RequestParam("id") long id,
                                   @RequestParam("fname") String fname,
                                    @RequestParam("lname") String lname){
        Person person = new Person();
        person.setId(id);
        person.setfName(fname);
        person.setlName(lname);
        jsonKafkaService.publishJsonMessage(person);
    }
}
