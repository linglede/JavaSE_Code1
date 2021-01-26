package com.study07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历
        for (String s:array){
            System.out.println(s);
        }

        Iterator<String> it = array.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        for (int i=0;i<array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }

        System.out.println("-------------");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s:linkedList){
            System.out.println(s);
        }

        Iterator<String> it1 = linkedList.iterator();
        while (it1.hasNext()){
            String s = it1.next();
            System.out.println(s);
        }

        for (int i=0;i<linkedList.size();i++){
            String s = linkedList.get(i);
            System.out.println(s);
        }

    }
}
