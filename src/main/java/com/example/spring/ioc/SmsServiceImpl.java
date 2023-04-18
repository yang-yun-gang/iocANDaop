package com.example.spring.ioc;

import org.springframework.stereotype.Service;

/**
 * @Description : TODO
 * @Author : young
 * @Date : 2022-06-05 21:30
 * @Version : 1.0
 **/
@Service
public class SmsServiceImpl implements SmsService {
    @Override
    public void hello() {
        System.out.println("hello spring");
    }
}
