package com.briup.day.day13.day13;

public interface List {

    /**
     * 添加数据
     * @param o 要添加的数据
     */
    void add(Object o);

    /**
     * 删除所有数据
     */
    void removeALL();

    /**
     * 根据数据的位置进行删除
     * @param index 数据位置
     */
    void remove(int index);

    /**
     * 修改指定位置的数据
     * @param index 数据位置
     */
    void update(int index, Object o);

    /**
     * 遍历容器
     */
    void forEach();

}
