package com.briup.ioc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Husband {

    private Integer id;
    private String name;
    private Double salary;
    private Date date;

}
