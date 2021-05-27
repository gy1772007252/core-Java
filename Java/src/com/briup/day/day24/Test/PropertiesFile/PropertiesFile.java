package com.briup.day.day24.Test.PropertiesFile;


import com.briup.day.day13.day13.ArrayList;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PropertiesFile {

    public static void main(String[] args) throws Exception{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("src/com/briup/day/day24/Test/PropertiesFile/a" +
                ".properties"));

        String line = "";
        String[] split = new String[100];
        Map map = new HashMap();
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
            split = line.split("=");
            map.put(split[0], split[1]);
        }
        Set set = map.keySet();
        String s = "";
        while (true) {
            s = in.readLine();
            for (Object o : set) {
                String s1 = (String) o;
                if (s.equals(s1)) {
                    System.out.println(map.get(s1));
                }
            }
        }

    }

}
