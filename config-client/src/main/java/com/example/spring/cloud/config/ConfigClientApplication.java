/**
 * Copyright (C), 2017-2017, 帮5采
 * FileName: ConfigServerApplication
 * Author:   tianyi
 * Date:     2017/9/28 17:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.spring.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * spring.cloud.config.label 指明远程仓库的分支
 * spring.cloud.config.profile
 * <p>
 * dev开发环境配置文件
 * test测试环境
 * pro正式环境
 *
 * @author tianyi
 * @create 2017/9/28
 * @since 1.0.0
 */
@EnableEurekaClient
@RestController
@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication.class).run(args);
    }

    @Value("${itzone123.api.version}")
    private String apiVersion;

    @GetMapping(value = "/hi")
    public String hi() {
        return apiVersion;
    }

}