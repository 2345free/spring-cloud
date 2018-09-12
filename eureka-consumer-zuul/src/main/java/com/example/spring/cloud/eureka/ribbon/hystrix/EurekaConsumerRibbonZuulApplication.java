package com.example.spring.cloud.eureka.ribbon.hystrix;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by luoxx on 2017/9/16.
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringCloudApplication
public class EurekaConsumerRibbonZuulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerRibbonZuulApplication.class).web(true).run(args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
