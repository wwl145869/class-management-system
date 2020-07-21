package com.pojo;

/**
 * @author gousheng
 * @date ${Date}- 10:34
 */
//科目pojo
public class Subject {

private int id;//标识
private String subject_name;//科目名称
private int teacher_id;//家长姓名

    public Subject() {
    }

    public Subject(int id, String subject_name, int teacher_id) {
        this.id = id;
        this.subject_name = subject_name;
        this.teacher_id = teacher_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subject_name='" + subject_name + '\'' +
                ", teacher_id=" + teacher_id +
                '}';
    }
}
