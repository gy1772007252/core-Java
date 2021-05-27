package com.briup.day.day6.day6;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Test2 test2 = new Test2();
        //test2.ImmediatelyAnIntegerWithinOneHundred();
        //test2.VerificationCode1();
        //test2.VerificationCode2();
        //test2.PrizeNumber();
        test2.ReturnsThePositionOfTheQueryNumber();
        //test2.DisplayCharacters();

    }

        public void ImmediatelyAnIntegerWithinOneHundred() {
            //产生10个 0~100 的随机整数
            int[] ints = new int[10];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = (int)(Math.random() * 100 + 1);
            }
            System.out.println(Arrays.toString(ints));
        }

        public void VerificationCode1() {
            //随机生成一组长度为4的验证码，包含大小写字母或数字
            char[] chars = new char[52];
            int a = 0, b = 0;

            for (int i = 97; i <= 122 ; i++) {
                chars[b] = (char)i;
                b++;
            }
            for (int i = 65; i <= 90 ; i++) {
                chars[b] = (char)i;
                b++;
            }
            for (int i = 0; i < 4; i++) {
                a = (int) ((int) (Math.random() * 10) / 5) + 1;
                if (a == 1) {
                    System.out.print(chars[(int)(Math.random() * 52)]);
                } else {
                    System.out.print((int)(Math.random() * 10));
                }
            }
        }

        public void VerificationCode2() {
            String s = "qwertyuiopasdfghjklzxcvbnm1234567890QWERTYUIOPLKJHGFDSAZXCVBNM";
            char[] chars = s.toCharArray();
            char[] arr = new char[4];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = chars[(int) (Math.random() * chars.length)];
                System.out.print(arr[i]);
            }
        }

        public void PrizeNumber() {
            //有一组手机号，随机抽取一个中奖号
            String[] Strings = new String[]{"13800000000", "138111111111", "13822222222", "13833333333", "13844444444", "13855555555", "13866666666", "13877777777", "13888888888", "13899999999"};
            System.out.println(Strings[(int)(Math.random() * 10)]);
        }

        public void ReturnsThePositionOfTheQueryNumber() {
            //随机生成一个20个整数的数组，输入要查询的数据，若数据存在返回数据所在位置，若不存在打印不存在。
            int[] ints = new int[20];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = (int)(Math.random() * 10);
            }
            //System.out.println(Arrays.toString(ints));
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            boolean b = false;
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == a) {
                    System.out.print(i + 1 + " ");
                    b = true;
                }
            }
            if (b == false) {
                System.out.println("不存在");
            }
        }

        public void DisplayCharacters() {
            //将ASCLL码位于32-126之间的95个字符显示在屏幕上
            int a = 0;
            for (int i = 32; i <= 126 ; i++) {
                System.out.print((char)i + "\t");
                a++;
                if (a % 10 == 0) {
                    System.out.println();
                }
            }
        }

}
