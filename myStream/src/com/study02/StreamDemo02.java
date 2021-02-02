package com.study02;

import java.util.ArrayList;

public class StreamDemo02 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("a林青霞");
        list.add("aaa");
        list.add("abbb");
        list.add("ccc");
        list.add("addd");

        //需求1：取前三个数据在控制台输出
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("------");

        //需求2：跳过3个元素，把剩下的元素在控制台输出
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("--------");

        //需求3：跳过2个元素：把剩下的元素中的前两个在控制台输出
        list.stream().skip(2).limit(2).forEach(System.out::println);
    }

}
