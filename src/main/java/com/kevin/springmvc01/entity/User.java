package com.kevin.springmvc01.entity;

import java.io.Serializable;

/**
 * 用户实体类
 * Created by jinyugai on 2018/5/30.
 */
public class User  implements Serializable{
    private static final  long SerializableUID = 1l;
    private int id;
    private String name;
    private String address;
    private String phone;

    public User(){
        super();
    }

    public User(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static long getSerializableUID() {
        return SerializableUID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return this.getId()+"   "+this.name;
    }
}
