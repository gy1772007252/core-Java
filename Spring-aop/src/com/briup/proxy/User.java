package com.briup.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class User {

    public static void main(String[] args) {

        Singer target = new Target();
        ClassLoader loader = Target.class.getClassLoader();
        Class<?>[] interfaces = Target.class.getInterfaces();
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("加强工作");
                Object result = method.invoke(target, args);
                return result;
            }
        };

        Singer proxy = (Singer) Proxy.newProxyInstance(loader, interfaces, handler);
        proxy.sing();
        System.out.println("代理对象proxy的真是类型：" + proxy.getClass());

    }

}
