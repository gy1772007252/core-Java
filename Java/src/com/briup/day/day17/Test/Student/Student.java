package com.briup.day.day17.Test.Student;

public class Student {

    private Integer id;
    private String name;
    private Sex sex;
    private Integer banji;
    private Integer score;

    public Student() {}
    public Student(Integer id, String name, Sex sex, Integer banji, Integer score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.banji = banji;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", banji=" + banji +
                ", score=" + score +
                '}';
    }
}

enum Sex {

    MAN("男"), WOMAN("女");

    private String sex;

    private Sex() {}
    private Sex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return sex;
    }

}
