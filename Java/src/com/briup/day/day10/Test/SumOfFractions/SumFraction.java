package com.briup.day.day10.Test.SumOfFractions;

public class SumFraction {

    GetArray getArray;
    long molecule, denominator;

    public SumFraction() {
        getArray = new GetArray();
        this.Sum();
    }

    public void Sum() {

        int[][] ints = getArray.GetArray();
        molecule= ints[0][0];
        denominator = ints[0][1];

        for (int i = 1; i < 10; i++) {
            molecule= molecule * ints[i][1] + ints[i][0] * denominator;
            denominator = denominator * ints[i][1];
            for (int j = 2; j <= denominator; j++) {
                if (j != denominator)
                    if (molecule % j == 0 && denominator % j == 0) {
                        molecule /= j;
                        denominator /= j;
                    }
            }

        }
        //System.out.println((double) molecule / (double) denominator);

    }

    @Override
    public String toString() {
        return "前十个分数之和为" + molecule + "/" + denominator;
    }
}
