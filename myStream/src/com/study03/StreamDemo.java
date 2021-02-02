package com.study03;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a林青霞");
        list.add("aaa");
        list.add("abbb");
        list.add("ccc");
        list.add("addd");

        //需求1：把集合中的元素在控制台中输出
        list.stream().forEach(System.out::println);


        //需求2：统计集合中有几个以a开头的元素，并把统计结果在控制台输出
        long count = list.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(count);

    }
}
