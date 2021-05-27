package com.briup.day.day26.Test.ToNum;

interface ZH {
    int toNum(String str);
}

public class ToNum {

    public static void main(String[] args) {

        ZH zh = (str) -> Integer.valueOf(str);
        String str = "1234567890";

        new ToNum().zh(str, zh);

    }

    private void zh(String str, ZH zh) {
        int i = zh.toNum(str);
        System.out.println(i);
    }

}
