package com.briup.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {SpringConfig.class})
public class AppConfig {

}
