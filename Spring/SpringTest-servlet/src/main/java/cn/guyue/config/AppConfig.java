package cn.guyue.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//用于指定当前类是一个spring配置类，当创建容器时会从该类上加载注解
@Import({SpringConfig.class, MybatisConfig.class})//引入包
public class AppConfig {
}
