package com.briup.day.day18.Test.DivisionByZero;

public class DivisionByZero1 {

    public static void main(String[] args) {

        try{
            new DivisionByZero1().division();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void division() throws Exception {
            int a = 10 / 0;
            throw new Exception();
    }

}
