package com.briup.day.day24.Test.Teacher;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) throws Exception {

        Map<String, Teacher> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ObjectOutputStream oos;
        ObjectInputStream ois;

        while (true) {
            String s = br.readLine();
            if (s.equals("exit")) {
                break;
            }
            String[] split = s.split("-");

            map.put(split[0], new Teacher(Integer.valueOf(split[0]), split[1], Double.parseDouble(split[2])));
        }

        oos = new ObjectOutputStream(new FileOutputStream("src/com/briup/day/day24/Test/Teacher" +
                "/map.txt"));
        oos.writeObject(map);

        ois = new ObjectInputStream(new FileInputStream("src/com/briup/day/day24/Test/Teacher" +
                "/map.txt"));
        Map<String, Teacher> map1 = (Map<String, Teacher>) ois.readObject();
        Set<Map.Entry<String, Teacher>> entries = map1.entrySet();
        for (Map.Entry<String, Teacher> entry : entries) {
            System.out.println(entry.getValue());
        }

        ois.close();
        oos.close();
        br.close();

    }

}
