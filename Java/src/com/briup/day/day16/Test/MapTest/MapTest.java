package com.briup.day.day16.Test.MapTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("香蕉", 5.6);
        map.put("樱桃", 25.0);
        map.put("桃子", 5.6);
        map.put("苹果", 2.3);
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string + ":" + map.get(string));
        }
        System.out.println("共有" + map.size() + "水果");

        map.put("香蕉", 10.9);
        map.remove("桃子");

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry);
        }

    }

}
