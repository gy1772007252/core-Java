package com.briup.day.day27.Test.StreamTest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    private static List<Trader> traders = Arrays.asList(
            new Trader("Raoul", "Cambridge"),
            new Trader("Mario","Milan"),
            new Trader("Alan","Cambridge"),
            new Trader("Brian","Cambridge")
    );

    private static List<Transaction> transactions = Arrays.asList(
            new Transaction("brian", 2011, 300),
            new Transaction("raoul", 2012, 1000),
            new Transaction("raoul", 2011, 400),
            new Transaction("mario", 2012, 710),
            new Transaction("mario", 2012, 700),
            new Transaction("alan", 2012, 950) );

    public static void main(String[] args) {

        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        //test6();
        //test7();
        //test8();

    }

    private static void test8() {
        Optional<Double> min = transactions.stream()
                .map(transaction -> transaction.getAmount())
                .min(Double::compareTo);
        System.out.println(min.get());
    }

    private static void test7() {
        Optional<Double> max = transactions.stream()
                .map(transaction -> transaction.getAmount())
                .max(Double::compareTo);
        System.out.println(max.get());

    }

    private static void test6() {
        List<String> cambridge = traders.stream()
                .filter(e -> e.getAddress().equals("Cambridge"))
                .map(trader -> trader.getName())
                .collect(Collectors.toList());
        cambridge.forEach(e -> {
            List<Transaction> collect = transactions.stream()
                    .filter(e1 -> e1.getName().equals(e.toLowerCase()))
                    .collect(Collectors.toList());
            collect.forEach(System.out :: println);
        });
    }

    private static void test5() {
        List<Trader> milan = traders.stream()
                .filter(e -> e.getAddress().equals("Milan"))
                .collect(Collectors.toList());
        milan.forEach(System.out :: println);
    }

    private static void test4() {
        List<String> collect = traders.stream()
                .map(trader -> trader.getName())
                .sorted((a, b) -> -b.compareTo(a))
                .collect(Collectors.toList());
        collect.forEach(e -> System.out.print(e + "\t"));

    }

    private static void test3() {
        List<Trader> cambridge = traders.stream()
                .filter(e -> e.getAddress().equals("Cambridge"))
                .sorted((a, b) -> - b.getName().compareTo(a.getName()))
                .collect(Collectors.toList());
        cambridge.forEach(System.out :: println);
    }

    private static void test2() {
        Set<String> collect = traders.stream()
                .map(trader -> trader.getAddress())
                .collect(Collectors.toSet());
        collect.forEach(e -> System.out.print(e + "\t"));
    }

    private static void test1() {
        List<Transaction> collect = transactions.stream()
                .filter(e -> e.getYear() == 2011)
                .sorted((a, b) -> (int) (a.getAmount() - b.getAmount()))
                .collect(Collectors.toList());
        collect.forEach(System.out :: println);
    }

}
