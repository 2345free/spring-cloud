package com.example.spring.cloud.stream.rabbitmq;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@Slf4j
@EnableBinding(Sink.class)
@SpringCloudApplication
public class StreamRabbitApp {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitApp.class, args);
    }

    @StreamListener(Sink.INPUT)
    public void handle(Person person) {
        log.info("Received: " + person);
    }

    @Data
    @ToString
    public static class Person {

        private String name;
    }
}
