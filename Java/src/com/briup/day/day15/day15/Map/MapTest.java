package com.briup.day.day15.day15.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map map = new HashMap();
        //存值，key - value 键值对，一个key映射一个value
        map.put("123", "不要脸");
        map.put(new Object(), new Object());
        map.put("123", "给爷笑一个");
        //取值
        Object o = map.get("123");
        System.out.println(o);

    }

}
