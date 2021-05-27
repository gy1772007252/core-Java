package com.briup.day.day10.Test.SingleObject;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        //SingleObject singleObject = new SingleObject();
        SingleObject object = SingleObject.getInstance();
        object.showMessage();

    }

}
