package com.briup.day.day6.day6;

public class ArrayTraversal {

    public static void main(String[] args) {

        String[] strings = {"hello", "world", "!"};

        for (int i = 0 ; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        System.out.println();

        for (String value : strings) {
            System.out.print(value + " ");
        }

    }

}
