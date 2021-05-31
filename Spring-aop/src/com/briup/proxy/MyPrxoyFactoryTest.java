package com.briup.proxy;

public class MyPrxoyFactoryTest {

    public static void main(String[] args) {

        Singer target = new Target();
        Singer proxy = MyProxyFatory.getProxy(target);
        proxy.sing();

    }

}
