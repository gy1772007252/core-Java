package com.briup.day.day26.Test.ZHDXbinJQ;

import java.util.Locale;

interface GetValue {
    public String getValue(String str);
}

public class TestLambda {

    public static void main(String[] args) {

        GetValue getValue = (str) -> str.toUpperCase(Locale.forLanguageTag(str));
        String str = "abcdefg higklmn opqrst uvwxyz";
        String getvalue = new TestLambda().getvalue(str, getValue);
        System.out.println(getvalue.substring(1, 4));

    }

    private String getvalue(String str, GetValue getValue) {
        return getValue.getValue(str);
    }

}
