package com.example.spring;

import com.example.spring.ioc.Hello;
import com.example.spring.ioc.Master;
import com.example.spring.ioc.Student;
import com.example.spring.ioc.User;
import org.springframework.context.ApplicationContext;
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
        Hello hello = context.getBean("llo",Hello.class);
        hello.show();

        Student student = context.getBean("student", Student.class);
        System.out.println(student);

        User user = context.getBean("user", User.class);
        System.out.println(user);

        Master master = context.getBean("master", Master.class);
        master.getCat().shout();
        master.getDog().shout();

    }
}
