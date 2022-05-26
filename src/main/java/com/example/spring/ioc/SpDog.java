package com.example.spring.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description : 用于java配置类
 * @Author : young
 * @Date : 2022-05-23 23:40
 * @Version : 1.0
 **/
@Component
public class SpDog {
    @Value("wang")
    public String name;
}
