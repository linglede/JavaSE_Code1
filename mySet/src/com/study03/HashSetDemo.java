package com.study03;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs = new HashSet<>();

        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");

        //遍历
        for (String s:hs){
            System.out.println(s);
        }
    }
}
