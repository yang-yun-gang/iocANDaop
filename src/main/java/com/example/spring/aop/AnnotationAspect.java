package com.example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Description : 注解实现aop
 * @Author : young
 * @Date : 2022-05-26 14:18
 * @Version : 1.0
 **/
@Component
@Aspect
public class AnnotationAspect {

    @Before("execution(* com.example.spring.aop.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("---方法执行前---");
    }

    @After("execution(* com.example.spring.aop.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("---方法执行后---");
    }

    @Around("execution(* com.example.spring.aop.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕前");
        // 执行目标方法proceed
        Object o = pj.proceed();
        System.out.println("环绕后");
        System.out.println(o);
    }
}
