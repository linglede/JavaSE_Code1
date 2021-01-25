package com.study02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        //添加元素
        c.add("1");
        c.add("12");
        c.add("13");

        //	Iterator<E> iterator():返回此集合中的迭代器，通过集合的iterator（）方法得到
        Iterator<String> it = c.iterator();

        //	E next() ：返回迭代中的下一个元素
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
       // System.out.println(it.next()); //NoSuchElementException

        //	boolean hasNext()：如果迭代具有更多元素，则返回true
/*
        if (it.hasNext()){
            System.out.println(it.next());
        }
        if (it.hasNext()){
            System.out.println(it.next());
        }
        if (it.hasNext()){
            System.out.println(it.next());
        }
        if (it.hasNext()){
            System.out.println(it.next());
        }*/

        while (it.hasNext()){

            String s = it.next();
            System.out.println(s);

            // System.out.println(it.next());
        }


    }
}
