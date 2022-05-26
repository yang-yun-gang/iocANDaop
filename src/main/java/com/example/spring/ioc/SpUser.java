package com.example.spring.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Description : 特殊用户，用注解添加进ioc容器
 * @Author : young
 * @Date : 2022-05-23 23:00
 * @Version : 1.0
 **/
@Component("spUser")
// 相当于配置文件中 <bean id="spUser" class="当前注解的类"/>
@Scope("prototype")
public class SpUser {

    public String name;

    @Value("yang")
    public void setName(String name) {
        this.name = name;
    }
}
