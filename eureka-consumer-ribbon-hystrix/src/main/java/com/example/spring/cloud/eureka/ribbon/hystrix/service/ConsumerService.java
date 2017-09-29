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
package com.example.spring.cloud.eureka.ribbon.hystrix.service;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author tianyi
 * @create 2017/9/29
 * @since 1.0.0
 */
public interface ConsumerService {

    String consumer();

    String fallback();

}