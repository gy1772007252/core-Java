package com.briup.day.day13.day13;

/**
 * 能无限添加的容器
 */
public class ArrayList implements List{

    private Object[] arr = new Object[8];
    //记录添加到数组的个数
    private int index = 0;

    //通过无参构造器创建对象 默认值 8
    public ArrayList() {}

    //通过有参构造器创建对象 数组长度手动设定
    public ArrayList(int length) {
        arr = new Object[length];
    }

    //对arr数组进行扩容
    public void expansion() {
        Object[] newArr = new Object[arr.length * 2];
        //将原数组内容copy到新数组
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    @Override
    public void add(Object o) {
        arr[index] = o;
        index++;
        if (index >= arr.length) {
            this.expansion();
        }
    }

    @Override
    public void removeALL() {
        index = 0;
    }

    @Override
    public void remove(int index) {
        index -= 1;
        //判断index是否在合理区间
        //index若为负数、超过了数组存储的最大个数、超过了数组的长度
        if (index < 0 && index >= arr.length && index > this.index) {
            System.out.println("index不合法");
            return;
        }
        System.arraycopy(arr, index + 1, arr, index, arr.length - index - 1);
        this.index--;
    }

    @Override
    public void update(int index, Object o) {
        index -= 1;
        if (index < 0 && index >= arr.length && index > this.index) {
            System.out.println("index不合法");
            return;
        }
        arr[index] = o;
    }

    @Override
    public void forEach() {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
