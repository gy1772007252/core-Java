package com.briup.day.day26.day26.Lambda;

public class Lambda1 {

    public static void main(String[] args) {

     int i = calculate(1, 100, (sum, j) -> sum + j);
     System.out.println(i);
     int i1 = calculate(1, 100, (sum, j) -> (sum + j) * i);
     System.out.println(i1);
     int i2 = calculate(1, 100, (sum, j) -> {
        if (j % 2 == 0) {
            sum += j;
        }
        return sum;
     });
     System.out.println(i2);

    }

    private static int calculate(int a, int b, Action action) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = action.jisuan(sum, i);
        }
        return sum;
    }

}
