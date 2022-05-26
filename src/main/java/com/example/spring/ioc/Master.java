package com.example.spring.ioc;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;

/**
 * @Description : TODO
 * @Author : young
 * @Date : 2022-05-06 14:45
 * @Version : 1.0
 **/
public class Master {
    @Resource
    private Cat cat;

    @Resource(name = "dog1")
    private Dog dog;

    @Value("123")
    private String str;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getStr() {
        return str;
    }
}
