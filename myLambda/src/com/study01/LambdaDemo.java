package com.study01;

/*启动一个线程，在控制台输出一句话*/

public class LambdaDemo {
    public static void main(String[] args) {
       //实现类的方式实现需求
//        MyRunnable my = new MyRunnable();
//
//        Thread t = new Thread(my);
//        t.start();

        //匿名内部类的方法改进
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多次你哦都被你成本低");
//            }
//        }).start();

        //Lambda表达式的方法改进
        new Thread(()->{
            System.out.println("多次你哦都被你成本低");
        }).start();
    }
}
