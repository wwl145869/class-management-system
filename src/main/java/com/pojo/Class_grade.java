package com.pojo;

/**
 * @author gousheng
 * @date ${Date}- 10:01
 */
//班级pojo
public class Class_grade {
    private int id;//唯一标识
    private String name;//班级名称
    private int student_id;//唯一标识
    private int teacher_id;//唯一标识

    public Class_grade() {
    }

    public Class_grade(String name) {
        this.name = name;
    }

    public Class_grade(int id, String name, int student_id, int teacher_id) {
        this.id = id;
        this.name = name;
        this.student_id = student_id;
        this.teacher_id = teacher_id;
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

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    @Override
    public String toString() {
        return "Class_grade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student_id=" + student_id +
                ", teacher_id=" + teacher_id +
                '}';
    }
}
