package com.briup.day.day17.day17;

enum Gender {
    MAN, WUMAN;
}

class Teacher{
    String name;
    Gender gender;

    public Teacher() {}
    public Teacher(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
public class Test {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("马玉龙", Gender.MAN);
        System.out.println(teacher);

    }

}
