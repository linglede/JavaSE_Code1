package com.study02;

public class ArgsDemo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("调用change方法前："+a);
        change(a);
        System.out.println("调用change方法后"+a);
    }
    public static void change(int a){
        a=200;
    }
}
