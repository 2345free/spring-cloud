package com.example.spring.cloud.eureka.ribbon.hystrix;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by luoxx on 2017/9/16.
 */
@SpringCloudApplication
public class EurekaConsumerRibbonHystrixApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerRibbonHystrixApplication.class).web(true).run(args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
