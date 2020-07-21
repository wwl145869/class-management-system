package com.pojo;

/**
 * @author gousheng
 * @date ${Date}- 10:17
 */
//家长pojo
public class Patriarch {
    private int id;//标识
    private String name;//家长名字
    private byte sex;//性别
    private int age;//年龄
    private String politics;//政治面貌
    private String phone;//手机号
    private String student_id;//学生id
    public Patriarch() {
    }

    public Patriarch(int id, String name, byte sex, int age, String politics, String phone, String student_id) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.politics = politics;
        this.phone = phone;
        this.student_id = student_id;
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

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String toString() {
        return "Patriarch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", politics='" + politics + '\'' +
                ", phone='" + phone + '\'' +
                ", student_id='" + student_id + '\'' +
                '}';
    }
}
