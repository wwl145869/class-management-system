package com.pojo;

/**
 * @author gousheng
 * @date ${Date}- 10:28
 */
//学生pojo
public class Student {
    private int id;//标识
    private String name;//学生姓名
    private byte sex;//性别
    private int age;//年龄
    private String politics;//政治面貌
    private int phone;//电话号
    private String home_site;//家庭地址
    private int score_id;//分数id
    private int class_grade_id;//班级id
    private int patriarch_id;//家长id
    private int teacher_id;//教师id
    private int subject_id;//科目id

    public Student() {
    }

    public Student(int id, String name, byte sex, int age, String politics, int phone, String home_site, int score_id, int class_grade_id, int patriarch_id, int teacher_id, int subject_id) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.politics = politics;
        this.phone = phone;
        this.home_site = home_site;
        this.score_id = score_id;
        this.class_grade_id = class_grade_id;
        this.patriarch_id = patriarch_id;
        this.teacher_id = teacher_id;
        this.subject_id = subject_id;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getHome_site() {
        return home_site;
    }

    public void setHome_site(String home_site) {
        this.home_site = home_site;
    }

    public int getScore_id() {
        return score_id;
    }

    public void setScore_id(int score_id) {
        this.score_id = score_id;
    }

    public int getClass_grade_id() {
        return class_grade_id;
    }

    public void setClass_grade_id(int class_grade_id) {
        this.class_grade_id = class_grade_id;
    }

    public int getPatriarch_id() {
        return patriarch_id;
    }

    public void setPatriarch_id(int patriarch_id) {
        this.patriarch_id = patriarch_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", politics='" + politics + '\'' +
                ", phone=" + phone +
                ", home_site='" + home_site + '\'' +
                ", score_id=" + score_id +
                ", class_grade_id=" + class_grade_id +
                ", patriarch_id=" + patriarch_id +
                ", teacher_id=" + teacher_id +
                ", subject_id=" + subject_id +
                '}';
    }
}
