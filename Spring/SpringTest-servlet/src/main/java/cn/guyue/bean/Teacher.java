package cn.guyue.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//全参构造器
@NoArgsConstructor//无参构造器
@Data//提供set()、get()等方法
public class Teacher {

    private int id;
    private String name;
    private int age;
    private double salary;

}
