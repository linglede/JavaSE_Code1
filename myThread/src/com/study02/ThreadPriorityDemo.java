package com.study02;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("aaa");
        tp2.setName("bbb");
        tp3.setName("ccc");

        //获取优先级，结果显示都是5
       // System.out.println(tp1.getPriority());
        //System.out.println(tp2.getPriority());
        //System.out.println(tp3.getPriority());

        //设置优先级
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        //System.out.println(Thread.MAX_PRIORITY);//10
        tp1.start();
        tp2.start();
        tp3.start();
    }
}
