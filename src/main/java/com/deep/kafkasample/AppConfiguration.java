package com.deep.kafkasample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Value(value = "${topic.id}")
    private String testTopic;

    @Value(value = "${sample.consumer.group.id}")
    private String sampleGroupId;

    @Value(value = "${json.topic.id}")
    private String jsonTopic;

    @Value(value = "${json.consumer.group.id}")
    private String jsonGroupId;


    public String getJsonTopic() {
        return jsonTopic;
    }

    public void setJsonTopic(String jsonTopic) {
        this.jsonTopic = jsonTopic;
    }

    public String getJsonGroupId() {
        return jsonGroupId;
    }

    public void setJsonGroupId(String jsonGroupId) {
        this.jsonGroupId = jsonGroupId;
    }

    public String getTestTopic() {
        return testTopic;
    }

    public void setTestTopic(String testTopic) {
        this.testTopic = testTopic;
    }

    public String getSampleGroupId() {
        return sampleGroupId;
    }

    public void setSampleGroupId(String sampleGroupId) {
        this.sampleGroupId = sampleGroupId;
    }
}
