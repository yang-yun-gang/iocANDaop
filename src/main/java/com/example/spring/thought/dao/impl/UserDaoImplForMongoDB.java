package com.example.spring.thought.dao.impl;


import com.example.spring.thought.dao.UserDao;

/**
 * @Description : TODO
 * @Author : young
 * @Date : 2022-05-01 22:22
 * @Version : 1.0
 **/
public class UserDaoImplForMongoDB implements UserDao {

    @Override
    public void getUser() {
        System.out.println("MongoDB获取用户数据");
    }
}
