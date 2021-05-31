package com.briup.proxy;

public class Target implements Singer {
    @Override
    public void sing() {
        System.out.println("目标对象进行歌曲演唱");
    }
}
