package com.study01;

public class MyThreadDemo {
    public static void main(String[] args) {
       // Mythread my1 = new Mythread();
        //Mythread my2 = new Mythread();

//        Mythread my1 = new Mythread("高铁");
//        Mythread my2 = new Mythread("飞机");

        //my1.setName("gaotie");
        //my2.setName("feiji");
        //启动线程
//        my1.start();
//        my2.start();

        //static Thread currentThread():返回当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
