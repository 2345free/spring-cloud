package com.example.spring.cloud.eureka.consumer.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by luoxx on 2017/9/16.
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class DcController {

    private final LoadBalancerClient loadBalancerClient;
    private final RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-service1");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
        log.info(url);
        return restTemplate.getForObject(url, String.class);
    }
}
