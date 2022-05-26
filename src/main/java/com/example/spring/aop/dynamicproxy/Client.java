package com.example.spring.aop.dynamicproxy;

/**
 * @Description : 客户
 * @Author : young
 * @Date : 2022-05-24 11:35
 * @Version : 1.0
 **/
public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 放置真实角色
        pih.setTarget(host);
        // 动态生成对应的代理类
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
