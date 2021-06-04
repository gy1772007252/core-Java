package cn.guyue.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration//用于指定当前类是一个spring配置类，当创建容器时会从该类上加载注解
@ComponentScan("cn.guyue.service")//用于指定spring在初始化容器时要扫描的包
@EnableTransactionManagement//表示开启AOP代理自动配置
public class SpringConfig {
}
