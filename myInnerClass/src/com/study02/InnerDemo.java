package com.study02;

public class InnerDemo {
    public static void main(String[] args) {
        //创建内部类对象，并调用方法
        /*Outer.Inner oi = new Outer().new Inner();
        oi.show();*/

        Outer o = new Outer();
        o.method();
    }
}
