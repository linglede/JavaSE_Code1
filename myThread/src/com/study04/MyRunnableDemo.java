package com.study04;

public class MyRunnableDemo {
    public static void main(String[] args) {
        //创建MyRunnable类的对象
        MyRunnable mr = new MyRunnable();

        //创建Thread类的对象，把MyRunnable对象作为构造方法的参数
//        Thread t1 = new Thread(mr);
//        Thread t2 = new Thread(mr);

        Thread t1 = new Thread(mr,"bbb");
        Thread t2 = new Thread(mr,"aaa");

        t1.start();
        t2.start();
    }
}
