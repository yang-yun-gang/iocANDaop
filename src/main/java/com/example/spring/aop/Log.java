package com.example.spring.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Description : 增强类，实现前置增强
 * @Author : young
 * @Date : 2022-05-25 11:59
 * @Version : 1.0
 **/
public class Log implements MethodBeforeAdvice {
    //method : 要执行的目标对象的方法
    //args : 被调用的方法的参数
    //target : 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
}
