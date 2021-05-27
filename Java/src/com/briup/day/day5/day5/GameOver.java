package com.briup.day5;

public class GameOver {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        System.out.println(a & b);
        System.out.println(a | b);

        //短路&&
         int c = 1, d = 2;
        System.out.println(c < 0 && d++ > 0); // c < 0 为 false, 发生短路不会继续执行故 d = 2
        System.out.println(d);
        //短路或
        System.out.println(c > 0 || d++ > 0); // c > 0 为 true， 发生短路不会继续执行故 d = 2
        System.out.println(d);

    }

}
