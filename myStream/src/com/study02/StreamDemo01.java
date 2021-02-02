package com.study02;

import java.util.ArrayList;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a林青霞");
        list.add("aaa");
        list.add("abbb");
        list.add("ccc");
        list.add("addd");

        //需求1 把list中以a开头的元素在控制台输出
        list.stream().filter((String s)->s.startsWith("a")).forEach(System.out::println);
        System.out.println("---------------");

        //需求2 把list中长度为3的元素在控制台输出
        list.stream().filter(s -> s.length()==3).forEach(System.out::println);
        System.out.println("---------------");

        //需求3 把list中以a开头的,长度为3的元素在控制台输出
        list.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).forEach(System.out::println);
    }
}
