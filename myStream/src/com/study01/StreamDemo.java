package com.study01;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a林青霞");
        list.add("aaa");
        list.add("abbb");
        list.add("ccc");
        list.add("addd");

        //把集合中所有以“a”开头的元素存储到一个新的集合中
        ArrayList<String> aList = new ArrayList<>();
        for (String s:list){
            if (s.startsWith("a")){
                aList.add(s);
            }
        }
        System.out.println(aList);

        //把“a”开头的集合中的长度为3的元素存储到一个新的集合中
        ArrayList<String> threeList = new ArrayList<>();

        for (String s :aList){
            if (s.length()==3){
                threeList.add(s);
            }
        }


        for (String s :threeList){
            System.out.println(s);
        }

        System.out.println("---------------");

        //采用Stream流
        list.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
    }

}
