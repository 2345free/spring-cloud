package com.example.spring.cloud.eureka.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 声明性REST客户端：Feign
 *
 * @author luoxiaoxiao
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeign {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerFeign.class).run(args);
    }
}
