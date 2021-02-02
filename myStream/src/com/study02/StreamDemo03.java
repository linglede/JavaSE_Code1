package com.study02;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a林青霞");
        list.add("aaa");
        list.add("abbb");
        list.add("ccc");
        list.add("addd");

        //需求1：取前4个数据组成一个流
        Stream<String> s1 = list.stream().limit(4);

        //需求2：跳过两个数据组成一个流
        Stream<String> s2 = list.stream().skip(2);

        //需求3：合并需求1和需求2得到的流，在控制台输出
        //Stream.concat(s1,s2).forEach(System.out::println);

        //System.out.println("-----------");
        //需求4：合并需求1和需求2得到的流，在控制台输出，要求字符串元素不能重复
        Stream.concat(s1,s2).distinct().forEach(System.out::println);
    }
}
