package com.example.spring.ioc;

/**
 * @Description : TODO
 * @Author : young
 * @Date : 2022-05-05 20:38
 * @Version : 1.0
 **/
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
