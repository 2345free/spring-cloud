package com.example.spring.cloud.eureka.ribbon.hystrix;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * 网关
 *
 * @author luoxiaoxiao
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringCloudApplication
public class EurekaConsumerZuulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerZuulApplication.class).run(args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
