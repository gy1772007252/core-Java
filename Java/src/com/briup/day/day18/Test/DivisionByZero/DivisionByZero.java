package com.briup.day.day18.Test.DivisionByZero;

public class DivisionByZero {

    public static void main(String[] args) {

        new DivisionByZero().division();

    }

    private void division() {
        try{
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
