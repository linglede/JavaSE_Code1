package com.study03;

public class ConvertDemo {
    public static void main(String[] args) {
        useConvert(s->Integer.parseInt(s));

        //引用类方法
        useConvert(Integer::parseInt);
    }

    private static void useConvert(Convert c){
        int number = c.convert("6666");
        System.out.println(number);
    }
}
