package com.example.spring.cloud.config.apollo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringCloudApplication
public class ApolloConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(ApolloConfigApp.class, args);
    }

    @Bean
    public ApplicationRunner greeting(@Value("${greeting}") String greeting) {
        return (args) -> {
            log.debug("打个招呼吧");
            log.info(greeting);
        };
    }
}
