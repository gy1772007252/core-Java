package com.briup.day.day16.Test.StringToCharArray;

import java.util.HashMap;
import java.util.Map;

public class StringToCharArray {

    public static void main(String[] args) {

        String s = "aabbddccaefdd";
        char[] chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (Character c:chars) {
            if (!(map.containsKey(c))) {
                map.put(c, 1);
                continue;
            }
            map.put(c, map.get(c) + 1);
        }
        System.out.println(map);

    }

}
