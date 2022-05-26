package com.example.spring.aop;
// 抽象角色，增删查改的业务
public interface UserService {
    void add();
    void delete();
    void query();
    void update();
}
