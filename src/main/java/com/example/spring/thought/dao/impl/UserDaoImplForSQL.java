package com.example.spring.thought.dao.impl;


import com.example.spring.thought.dao.UserDao;

/**
 * @Description : 实现用SQL查询数据库
 * @Author : young
 * @Date : 2022-05-01 22:10
 * @Version : 1.0
 **/
public class UserDaoImplForSQL implements UserDao {
    @Override
    public void getUser() {
        System.out.println("sql获取用户数据");
    }
}
