package com.study06;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        String s = "林青霞,30";

        convert(s,ss->ss.split(",")[1],ss->Integer.parseInt(ss),i->i+70 );

    }
    private static void convert(String s,Function<String,String>fun1,Function<String,Integer>fun2,Function<Integer,Integer>fun3){
        int i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);

    }
}
