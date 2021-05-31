package com.briup.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxyFatory {

    @SuppressWarnings("unchecked")
    public static <T> T getProxy(T target) {

        Class<?> c = target.getClass();
        ClassLoader classLoader = c.getClassLoader();
        Class<?>[] interfaces = c.getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(target);
        T proxy = (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
        return proxy;

    }

    private static class MyInvocationHandler implements  InvocationHandler{

        private Object target;

        public MyInvocationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String classname = target.getClass().getName();
            String methodName = method.getName();
            System.out.println(classname + "类型对象中：" + methodName + "方法被调用");
            Object result = method.invoke(target, args);
            return result;
        }
    }

}
