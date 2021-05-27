package com.briup.day.day15.day15.TreeSet;

import java.util.Comparator;

public class TeacherComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Teacher t1 = (Teacher) o1;
        Teacher t2 = (Teacher) o2;
        return t2.getAge() - t1.getAge() == 0 ? t2.getName().compareTo(t1.getName()) : t2.getAge() - t1.getAge();
    }

}
