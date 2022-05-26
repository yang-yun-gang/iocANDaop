package com.example.spring.aop.staticproxy;

/**
 * @Description : 代理角色
 * @Author : young
 * @Date : 2022-05-24 10:30
 * @Version : 1.0
 **/
public class Proxy implements Rent{

    // 中介代理房东完成租房
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }

    private void seeHouse() {
        System.out.println("中介带人看房子");
    }

    private void fare() {
        System.out.println("收取中介费");
    }

}
