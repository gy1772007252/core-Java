package cn.guyue.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//提供全参构造器
@NoArgsConstructor//提供无参构造器
@Data//提供set()、get()等其他方法
public class Teacher {

    private int id;
    private String name;
    private int age;
    private double salary;

}
