package com.study03;

public interface Inter {

    default void show1(){
        System.out.println("show1开始执行");
       // show();
    }

    default void show2(){
        System.out.println("show2开始执行");
      //  show();
    }

    //Java8以后可以实现
//    private void show(){
//        System.out.println("qqqqqq");
//        System.out.println("qqqqqq");
//    }

    static void method1(){
        System.out.println("method1开始执行");
        //method();
    }

    static void method2(){
        System.out.println("method2开始执行");
        //method();
    }

//    private static void method(){
//        System.out.println("ffrfr");
//    }
}
