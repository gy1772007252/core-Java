package com.briup.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SpringConfig.class, MybatisConfig.class})
public class AppConfig {
}
