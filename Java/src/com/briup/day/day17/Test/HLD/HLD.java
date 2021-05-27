package com.briup.day.day17.Test.HLD;

public enum HLD {

    Red(){
        @Override
        public void show() {
            System.out.println("红灯停");
        }
    }, Green(){
        @Override
        public void show() {
            System.out.println("绿灯行");
        }
    }, Yellow(){
        @Override
        public void show() {
            System.out.println("黄灯等一等");
        }
    };

    public abstract void show();

}
