package com.briup.day.day24.Test.Object;

import java.io.Serializable;
import java.util.ArrayList;

public class MyList extends ArrayList implements Serializable {

    private String name = "MyList";
    private int num = 10;
    private static final long serialVersionUID = -276050747200775360L;

    @Override
    public String toString() {
        return "MyList{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

}
