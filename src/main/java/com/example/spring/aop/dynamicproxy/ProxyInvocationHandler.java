package com.example.spring.aop.dynamicproxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @Description : 动态代理类
 * @Author : young
 * @Date : 2022-05-24 11:32
 * @Version : 1.0
 **/
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public void setTarget(Object rent) {
        this.target = rent;
    }

    // 生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    //记录日志
    public void log(String methodName) {
        System.out.println("执行了" + methodName + "方法");
    }

}
