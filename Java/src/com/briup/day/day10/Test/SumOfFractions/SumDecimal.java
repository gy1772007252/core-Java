package com.briup.day.day10.Test.SumOfFractions;

public class SumDecimal {

    GetArray getArray;
    double sum;

    public SumDecimal() {
        getArray = new GetArray();
        this.SumDecimal();
    }

    public void SumDecimal() {

        int[][] ints = getArray.GetArray();
        for (int i = 0; i < ints.length; i++) {
            sum += (double) ints[i][0] / (double) ints[i][1];
            //if (i == 9) System.out.println(sum);
        }

    }

    @Override
    public String toString() {
        return "前二十个分数之和为" + sum;
    }
}
