package com.study01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<String> c = new ArrayList<>();

        //添加元素：boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");

        //输出
        System.out.println(c);
    }
}
