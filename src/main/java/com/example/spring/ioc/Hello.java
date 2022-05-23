package com.example.spring.ioc;

/**
 * @Description : TODO
 * @Author : young
 * @Date : 2022-05-03 21:58
 * @Version : 1.0
 **/
public class Hello {
    private String name;

    public Hello(String name) {
        System.out.println("有参构造创建对象");
        this.name = name;
    }

    public void show() {
        System.out.println("Hello," + name);
    }
}
