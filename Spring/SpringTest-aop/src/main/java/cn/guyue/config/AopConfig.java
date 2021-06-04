package cn.guyue.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//表示开启AOP代理自动配置
// 如果配@EnableAspectJAutoProxy表示使用cglib进行代理对象的生成
//设置@EnableAspectJAutoProxy(exposeProxy=true)表示通过aop框架暴露该代理对象，aopContext能够访问.
@EnableAspectJAutoProxy
@ComponentScan("cn.guyue")//会扫描该类所在的包下所有的配置类
@Configuration//让spring容器来管理对象，相当于在xml中配置一个bean
public class AopConfig {
}
