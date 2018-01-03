/**
 * Copyright (C), 2017-2017, 帮5采
 * FileName: ConsumerServiceImpl
 * Author:   tianyi
 * Date:     2017/9/29 14:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.spring.cloud.eureka.ribbon.hystrix.service.impl;

import com.example.spring.cloud.eureka.ribbon.hystrix.service.ConsumerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author tianyi
 * @create 2017/9/29
 * @since 1.0.0
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        return restTemplate.getForObject("http://eureka-service1/dc", String.class);
    }

    public String fallback() {
        return "fallback";
    }

}