package com.example.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description : java配置类
 * @Author : young
 * @Date : 2022-05-23 23:41
 * @Version : 1.0
 **/
@Configuration //代表这是一个配置类
public class MyConfig {

    @Bean //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    public SpDog spDog() {
        return new SpDog();
    }

}
