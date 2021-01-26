package com.study05;

import java.util.ArrayList;
import java.util.List;

public class forDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i:arr){
            System.out.println(i);
        }

        String[] strArr = {"hello","world","java"};
        for (String s:strArr){
            System.out.println(s);
        }

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for (String s:list){
            System.out.println(s);
        }

        //验证其内部原理为Iterator迭代器,如果是则报错
//        for (String s:list){
//            if (s.equals("world")){
//                list.add("javaee");
//            }
//        }
    }
}
