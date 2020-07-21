package com.pojo;

import org.apache.ibatis.annotations.Lang;

/**
 * @author gousheng
 * @date ${Date}- 10:37
 */
//教师pojo
public class Teacher {

    private int id;//标识
    private String name;//教师姓名
    private String sex;//性别
    private int age;//年龄
    private long phone;//电话号
    private String politics;//教师政治面貌
    private String home_site;//家庭地址

    public Teacher() {
    }

    public Teacher(int id, String name, String sex, int age, long phone, String politics, String home_site) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.politics = politics;
        this.home_site = home_site;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public String getHome_site() {
        return home_site;
    }

    public void setHome_site(String home_site) {
        this.home_site = home_site;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", phone=" + phone +
                ", politics='" + politics + '\'' +
                ", home_site='" + home_site + '\'' +
                '}';
    }
}
