package com.briup.day.day14.Test.ScoreTom;

import java.util.Objects;

public class Person implements Comparable {

    private String name;
    private int score;

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return score == person.score &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Person)) {
            System.out.println("不同类型不能比较！");
            System.exit(-1);
        }
        Person p = (Person) o;
        if (this.name.equals("tom")) {
            return -1;
        }
        if (p.getName().equals("tom")) {
            return 1;
        }
        //熟记
        return p.getScore() - this.score == 0 ? 0 : p.getScore() - this.score;
    }
}
