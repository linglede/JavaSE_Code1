package com.study06;

public class BoxDemo {
    public static void main(String[] args) {
        //创建奶箱对象，这是共享数据区域
        Box b = new Box();

        Producer p = new Producer(b);

        Customer c = new Customer(b);

        //创建2个线程对象
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        //启动线程
        t1.start();
        t2.start();

    }
}
