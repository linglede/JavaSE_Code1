package com.study02;

public interface Inter {
    void show();

    default void method(){
        System.out.println("inter中的默认方法实现了");
    }

    public static void test(){
        System.out.println("inter中的静态方法实现了");}
}
