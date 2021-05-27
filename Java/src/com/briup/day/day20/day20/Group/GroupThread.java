package com.briup.day.day20.day20.Group;

public class GroupThread {

    public static void main(String[] args) {

        //改变子线程的线程组
        ThreadGroup threadGroup = new ThreadGroup("龙组");
        Thread thread1 = new Thread(threadGroup, "龙一");
        System.out.println(thread1.getThreadGroup());
        //查询线程组中存活的线程个数
        System.out.println(threadGroup.activeCount());

    }

}
