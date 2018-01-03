package com.example.spring.cloud.eureka.ribbon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by luoxx on 2017/9/16.
 */

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerRibbonApplication.class).web(true).run(args);
    }

    @Bean
    @LoadBalanced // 开启负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
