package com.study06;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
//        convert("100",s->Integer.parseInt(s));
//        convert("100",Integer::parseInt);

        //convert(11,s->String.valueOf(s+59));

        convert("100",s->Integer.parseInt(s),i->String.valueOf(i+5675));

    }

    //定义一个方法，把一个字符串转换int类型，在控制台输出
    private static void convert(String s, Function<String,Integer> fun){
        int i = fun.apply(s);
        System.out.println(i);
    }

    //定义一个方法，把一个int类型的数据加上一个整数后，转为字符串在控制台输出
    private static void convert(int i,Function<Integer,String>fun){
        String s = fun.apply(i);
        System.out.println(s);
    }

    //定义一个方法，把一个字符串转换int类型，把int类型的数据加上一个整数之后，转换为字符串在控制台输出
    private static void convert(String s,Function<String,Integer> fun1,Function<Integer,String> fun2){
//        Integer i = fun1.apply(s);
//        String ss = fun2.apply(i);
//        System.out.println(ss);
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
