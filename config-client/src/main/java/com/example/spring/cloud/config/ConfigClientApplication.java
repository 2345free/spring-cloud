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

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author tianyi
 * @create 2017/9/28
 * @since 1.0.0
 */
@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }

}