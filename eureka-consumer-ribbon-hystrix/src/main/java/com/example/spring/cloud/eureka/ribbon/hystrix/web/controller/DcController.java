package com.example.spring.cloud.eureka.ribbon.hystrix.web.controller;

import com.example.spring.cloud.eureka.ribbon.hystrix.service.ConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luoxx on 2017/9/16.
 */
@RestController
@RequiredArgsConstructor
public class DcController {

    private final ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }
}
