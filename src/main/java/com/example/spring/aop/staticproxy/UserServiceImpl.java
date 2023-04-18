package com.example.spring.aop.staticproxy;

/**
 * @Description : 真实角色
 * @Author : young
 * @Date : 2022-05-24 10:47
 * @Version : 1.0
 **/
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void query() {
        System.out.println("查询用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }
}
