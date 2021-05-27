package com.briup.day.day17.Test.Week;

public enum Week {

    Monday() {
        @Override
        public void print() {
            System.out.println(Monday + "星期一");
        }
    }, Tuesday() {
        @Override
        public void print() {
            System.out.println(Tuesday + " 星期二");
        }
    }, Wednesday() {
        @Override
        public void print() {
            System.out.println(Wednesday + " 星期三");
        }
    }, Thursday() {
        @Override
        public void print() {
            System.out.println(Thursday + " 星期四");
        }
    }, Friday() {
        @Override
        public void print() {
            System.out.println(Friday + " 星期五");
        }
    }, Saturday() {
        @Override
        public void print() {
            System.out.println(Saturday + " 星期六");
        }
    }, Sunday() {
        @Override
        public void print() {
            System.out.println(Sunday + " 星期日");
        }
    };

    public abstract void print();

}
