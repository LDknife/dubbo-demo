package com.ld.dubbo.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 用户实体类
 */
public class User implements Serializable {

    private String name;

    private int age;

    private List<String> addressList;

    public User() {
    }

    public User(String name, int age, List<String> addressList) {
        this.name = name;
        this.age = age;
        this.addressList = addressList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }
}
