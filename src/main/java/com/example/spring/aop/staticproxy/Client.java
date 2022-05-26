package com.example.spring.aop.staticproxy;

/**
 * @Description : 客户
 * @Author : young
 * @Date : 2022-05-24 10:36
 * @Version : 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
