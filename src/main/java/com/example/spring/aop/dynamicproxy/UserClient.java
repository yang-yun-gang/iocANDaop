package com.example.spring.aop.dynamicproxy;

/**
 * @Description : 调用程序
 * @Author : young
 * @Date : 2022-05-24 11:00
 * @Version : 1.0
 **/
public class UserClient {
    public static void main(String[] args) {
        // 真实对象
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        // 代理对象调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置要代理的对象
        pih.setTarget(userServiceImpl);
        // 生成动态代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
        proxy.delete();
    }
}
