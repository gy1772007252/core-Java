package com.briup.day.day12.Test.Father;

public class Father {

    private String name = "zhangjun";

    public class Child {

        public void introFather() {
            System.out.println(Father.this.name);
        }

    }

}
