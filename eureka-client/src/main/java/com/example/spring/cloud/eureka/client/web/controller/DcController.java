package com.example.spring.cloud.eureka.client.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by luoxx on 2017/9/16.
 */
@RestController
@RequiredArgsConstructor
public class DcController {

    private final DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @GetMapping("/dc")
    public String dc() {
        InetAddress localHost = null;
        try {
            localHost = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String services = "Services: " + discoveryClient.getServices() + "[" + localHost.getHostAddress() + ":" + port + "]";
        return services;
    }

}
