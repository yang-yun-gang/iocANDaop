package com.example.spring.ioc;

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
