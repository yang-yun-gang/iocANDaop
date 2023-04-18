package com.example.spring.aop.staticproxy;

/**
 * @Description : 代理角色
 * @Author : young
 * @Date : 2022-05-24 10:49
 * @Version : 1.0
 **/
public class UserServiceProxy implements UserService {

    UserServiceImpl userServiceImpl;

    public UserServiceProxy(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public void add() {
        System.out.println("log:add");
        userServiceImpl.add();
    }

    @Override
    public void delete() {
        System.out.println("log:delete");
        userServiceImpl.delete();
    }

    @Override
    public void query() {
        System.out.println("log:query");
        userServiceImpl.query();
    }

    @Override
    public void update() {
        System.out.println("log:update");
        userServiceImpl.update();
    }
}
