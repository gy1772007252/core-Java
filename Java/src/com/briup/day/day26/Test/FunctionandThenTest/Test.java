package com.briup.day.day26.Test.FunctionandThenTest;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {

        Function<String, Integer> function1 = (str) -> Integer.valueOf(str);
        Function<Integer, String> function2 = (integer) -> String.valueOf(integer + 10);
        Function<String, String> function = function1.andThen(function2);
        String str = "123";
        new Test().test(str, function);

    }

    private void test(String str, Function<String, String> function) {
        System.out.println(function.apply(str));
    }

}
