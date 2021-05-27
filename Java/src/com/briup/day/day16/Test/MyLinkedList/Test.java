package com.briup.day.day16.Test.MyLinkedList;

public class Test {

    public static void main(String[] args) throws Exception {

        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.show();
        list.remove(0);
        System.out.println();
        list.show();
        list.add(1,4);
        System.out.println();
        list.show();

    }

}
