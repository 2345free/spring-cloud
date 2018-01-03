package com.example.spring.cloud.eureka.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonFeign {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerRibbonFeign.class).web(true).run(args);
    }
}
