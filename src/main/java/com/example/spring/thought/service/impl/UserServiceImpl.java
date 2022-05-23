package com.example.spring.thought.service.impl;


import com.example.spring.thought.dao.UserDao;
import com.example.spring.thought.service.UserService;

/**
 * @Description : TODO
 * @Author : young
 * @Date : 2022-05-01 22:12
 * @Version : 1.0
 **/
public class UserServiceImpl implements UserService {

    // 调用dao层去获取用户信息，实现类获取会发生变化
    //private UserDao userDao = new UserDaoImplForSQL();

    private UserDao userDao;

    // 把控制权交给调用方
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUserInfo() {
        userDao.getUser();
    }
}
