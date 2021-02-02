package com.study01;

public class Demo {
    public static void main(String[] args) {
        MyInterface my = ()->System.out.println("函数式接口");
        my.show();
    }
}
