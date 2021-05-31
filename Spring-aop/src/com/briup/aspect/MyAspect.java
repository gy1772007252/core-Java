package com.briup.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.briup.service..*.*(..))")
    public void pointcut1() {}

    @Pointcut("execution(* com.briup.service..*.delete*(..))")
    public void pointcut2() {}

    @Before("pointcut1()")
    public void beforAdvice() {
        System.out.println("前置通知");
    }

    @AfterReturning("pointcut1()")
    public void afterReturn() {
        System.out.println("后置通知");
    }

    @AfterThrowing("pointcut2()")
    public void throwable() {
        System.out.println("异常通知");
    }

    @After("pointcut1()")
    public void after() {
        System.out.println("最终通知");
    }

    @Around("pointcut1()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知：前");
        Object[] args = joinPoint.getArgs();
        joinPoint.proceed(args);
        System.out.println("环绕通知：后");
    }

}
