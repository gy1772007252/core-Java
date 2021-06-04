package cn.guyue.ioc;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data//为类提供读写属性, 此外还提供了 equals()、hashCode()、toString() 方法
@Component//让spring容器来管理对象，相当于在xml中配置一个bean
public class Teacher {

    private int id;
    private String name;
    private int age;


}
