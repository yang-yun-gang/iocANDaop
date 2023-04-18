package com.example.spring;

import com.example.spring.aop.UserService;
import com.example.spring.ioc.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description : TODO
 * @Author : young
 * @Date : 2022-05-03 22:09
 * @Version : 1.0
 **/
public class MyTest {
    public static void main(String[] args) {
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id
        Hello hello = context.getBean("llo", Hello.class);
        hello.show();

        Student student = context.getBean("student", Student.class);
        System.out.println(student);

        User user = context.getBean("user", User.class);
        System.out.println(user);

        Master master = context.getBean("master", Master.class);
        master.getCat().shout();
        master.getDog().shout();
        System.out.println(master.getStr());

        SpUser spUser = context.getBean("spUser", SpUser.class);
        System.out.println(spUser.name);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        SpDog spDog = applicationContext.getBean("spDog", SpDog.class);
        System.out.println(spDog.name);

        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
