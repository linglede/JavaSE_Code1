package com.study02;

import java.util.ArrayList;

public class StreamDemo04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("lingqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangwuji");

        //需求1：按照字母顺序把数据在控制台输出
        //list.stream().sorted().forEach(System.out::println);

        //需求2：按照字符串长度把数据在控制台输出
//        list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
        list.stream().sorted((s1,s2)->{
            int num = s1.length()-s2.length();
            int num1 = num==0?s1.compareTo(s2):num;
            return num1;
        }).forEach(System.out::println);

    }
}
