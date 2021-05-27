package com.briup.day.day16.Test.TeacherTest;

public class Teacher implements Comparable{

    private Integer id;
    private String name;
    private int age;

    public Teacher() {}

    public Teacher(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Teacher teacher = (Teacher) o;

        return this.name.compareTo(teacher.getName()) == 0 ? (this.age - teacher.getAge() == 0 ? this.id - teacher.getId() : this.age - teacher.getAge()) : this.name.compareTo(teacher.getName());
    }

}
