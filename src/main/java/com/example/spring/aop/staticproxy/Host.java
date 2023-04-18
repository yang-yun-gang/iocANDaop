package com.example.spring.aop.staticproxy;

/**
 * @Description : 被代理角色
 * @Author : young
 * @Date : 2022-05-24 10:28
 * @Version : 1.0
 **/
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
