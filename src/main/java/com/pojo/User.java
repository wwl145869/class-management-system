package com.pojo;

import org.springframework.stereotype.Component;

/**
 * @author gousheng
 * @date ${Date}- 15:19
 */
//用户pojo
public class User {
    private int id;//标识
    private String name;//用户真名
    private String user_name;//用户账号
    private String user_password;//用户密码
    private int power;//用户权限 1最高管理员，2中等老师，3学生

    public User() {
    }

    public User(int id, String name, String user_name, String user_password, int power) {
        this.id = id;
        this.name = name;
        this.user_name = user_name;
        this.user_password = user_password;
        this.power = power;
    }
    public User(String name, String user_name, String user_password, int power){
        this.name = name;
        this.user_name = user_name;
        this.user_password = user_password;
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", power=" + power +
                '}';
    }
}
