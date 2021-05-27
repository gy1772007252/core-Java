package com.briup.day.day19.day19.Exception;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            t1();
        } catch (LoginException e) {
            e.printStackTrace();
        }

    }

    private static void t1() throws LoginException {

        try {
            int i = 10 / 0;
        } catch (ArithmeticException e) {
            throw new LoginException("除数为零");
        }

    }

}
