package com.briup.day.day10.Test.SumOfFractions;

public class GetArray {

    int[][] ints = new int[20][2];

    public GetArray() {
        ints[0][0] = 2;
        ints[0][1] = 1;
    }

    public int[][] GetArray() {

        for (int i = 1; i < ints.length; i++) {
            ints[i][0] = ints[i - 1][0] + ints[i - 1][1];
            ints[i][1] = ints[i - 1][0];
        }
        return ints;
    }

}
