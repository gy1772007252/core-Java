package com.briup.ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {

    @Value("1")
    private int id;
    @Value("tom")
    private String name;

}
