package com.pojo;

/**
 * @author gousheng
 * @date ${Date}- 10:26
 */
//分数表
public class Score {
    private int id;//标识
    private int subject_id;//学生id
    private double score;//分数

    public Score() {
    }

    public Score(int id, int subject_id, double score) {
        this.id = id;
        this.subject_id = subject_id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", subject_id=" + subject_id +
                ", score=" + score +
                '}';
    }
}
