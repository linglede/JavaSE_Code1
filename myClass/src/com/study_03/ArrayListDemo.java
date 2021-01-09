package com.study_03;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //public ArrayList()创建一个集合对象
        ArrayList<String> array = new ArrayList<String>();
        //public Boolean add(E e)	将指定的元素追加到此集合的结尾
        array.add("hello");
        array.add("world");
        array.add("java");

        //public void add(int index,E element)	在此集合的指定位置插入指定的元素
        array.add(1,"javase");

        //越界
        //array.add(5,"dfdf");

        //输出
        System.out.println("array"+array);
    }
}
