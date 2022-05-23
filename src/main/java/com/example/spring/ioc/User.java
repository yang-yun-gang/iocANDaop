package com.example.spring.ioc;

/**
 * @Description : TODO
 * @Author : young
 * @Date : 2022-05-05 20:55
 * @Version : 1.0
 **/
public class User {
    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
