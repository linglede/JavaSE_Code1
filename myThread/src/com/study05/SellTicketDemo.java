package com.study05;

/*需求：某电影院目前正在上映国产大片，共有100张电影票，有3个窗口卖票，模拟电影院卖票*/

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        //创建3个Thread类的对象，把SellTicket对象作为构造方法参数
        Thread t1 = new Thread(st,"NO.1");
        Thread t2 = new Thread(st,"NO.2");
        Thread t3 = new Thread(st,"NO.3");

        t1.start();
        t2.start();
        t3.start();
    }
}
