package com.example.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Description : 测试接口注入
 * @Author : young
 * @Date : 2022-06-05 21:24
 * @Version : 1.0
 **/
@Component
public class Test {

    @Autowired
    private SmsService smsService;

    public static void main(String[] args) {
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id
        Test test = context.getBean("test", Test.class);
        test.smsService.hello();
    }
}
