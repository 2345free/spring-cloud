/**
 * Copyright (C), 2017-2017, 帮5采
 * FileName: ConsumerService
 * Author:   tianyi
 * Date:     2017/9/29 14:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.spring.cloud.eureka.feign.service;

import com.example.spring.cloud.eureka.feign.service.impl.ConsumerServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author tianyi
 * @create 2017/9/29
 * @since 1.0.0
 */
@FeignClient(value = "eureka-service1", fallback = ConsumerServiceImpl.class)
public interface ConsumerService {

    /**
     * 高版本的spring cloud支持使用@GetMapping
     *
     * @return
     */
    @RequestMapping(value = "/dc", method = RequestMethod.GET)
    String consumer();

}