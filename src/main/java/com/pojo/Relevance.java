package com.pojo;

/**
 * @author gousheng
 * @date ${Date}- 10:21
 */
//关联表pojo
public class Relevance {
    private int id;//标识
    private int class_grade_id;//班级id
    private int patriarch_id;//家长id
    private int teacher_id;//教师id
    private int subject_id;//学科id
    private int student_id;//学生id

    public Relevance() {
    }

    public Relevance(int id, int class_grade_id, int patriarch_id, int teacher_id, int subject_id, int student_id) {
        this.id = id;
        this.class_grade_id = class_grade_id;
        this.patriarch_id = patriarch_id;
        this.teacher_id = teacher_id;
        this.subject_id = subject_id;
        this.student_id = student_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String toString() {
        return "Relevance{" +
                "id=" + id +
                ", class_grade_id=" + class_grade_id +
                ", patriarch_id=" + patriarch_id +
                ", teacher_id=" + teacher_id +
                ", subject_id=" + subject_id +
                ", student_id=" + student_id +
                '}';
    }
}
