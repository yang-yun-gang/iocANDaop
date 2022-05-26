package com.example.spring.aop.staticproxy;

/**
 * @Description : 调用程序
 * @Author : young
 * @Date : 2022-05-24 11:00
 * @Version : 1.0
 **/
public class UserClient {
    public static void main(String[] args) {
        // 被代理类
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        // 交给代理去做
        UserService proxy = new UserServiceProxy(userServiceImpl);
        proxy.add();
        proxy.query();
    }
}
