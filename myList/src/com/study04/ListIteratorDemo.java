package com.study04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //通过List集合的listIterator()方法得到
//        ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()){
//            String s = lit.next();
//            System.out.println(s);
//        }
//
//        //	E previous():返回列表中的上一个元素
//        while(lit.hasPrevious()){
//            String s1 = lit.previous();
//            System.out.println(s1);
//        }
//
//
         //获取列表迭代器,不会产生并发修改异常
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            if (s.equals("world")){
                lit.add("javaee");
            }
        }

        System.out.println(list);





    }
}
