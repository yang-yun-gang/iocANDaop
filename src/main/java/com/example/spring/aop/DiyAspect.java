package com.example.spring.aop;

/**
 * @Description : 自定义切面
 * @Author : young
 * @Date : 2022-05-26 13:49
 * @Version : 1.0
 **/
public class DiyAspect {
    public void before() {
        System.out.println("---方法执行前---");
    }

    public void after() {
        System.out.println("---方法执行后---");
    }
}
