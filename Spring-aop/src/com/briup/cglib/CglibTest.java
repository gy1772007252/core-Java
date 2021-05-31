package com.briup.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibTest {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(StudentService.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("开启事务");
                Object result = methodProxy.invokeSuper(proxy, args);
                System.out.println("提交事务");
                return result;
            }
        });

        StudentService studentService = (StudentService) enhancer.create();
        studentService.saveOrUpdate();

    }

}
