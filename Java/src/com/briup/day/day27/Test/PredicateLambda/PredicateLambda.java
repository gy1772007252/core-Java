package com.briup.day.day27.Test.PredicateLambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateLambda {

    public static void main(String[] args) {

        List<String> collect1 = Stream.of("水煮鱼", "酸菜鱼", "麻辣鱼", "麻婆豆腐", "回锅肉", "鱼香肉丝", "水煮肉片", "宫保鸡丁", "剁椒鱼头", "夫妻肺片")
                .filter(e -> e.length() == 3)
                .collect(Collectors.toList());
        collect1.forEach(e -> System.out.print(e + "\t"));

        System.out.println();

        List<String> collect2 = Stream.of("水煮鱼", "酸菜鱼", "麻辣鱼", "麻婆豆腐", "回锅肉", "鱼香肉丝", "水煮肉片", "宫保鸡丁", "剁椒鱼头", "夫妻肺片")
                .filter(e -> e.indexOf("鱼") != -1)
                .collect(Collectors.toList());
        collect2.forEach(e -> System.out.print(e + "\t"));

    }

}
