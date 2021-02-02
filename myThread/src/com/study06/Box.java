package com.study06;

/**
 * @author 17910
 */
public class Box {
    //定义一个成员变量，表示第x瓶奶
    private int milk;

    //定义一个成员变量，表示奶箱状态
    private boolean state = false;

    //提供存储牛奶和获取牛奶操作
    public synchronized void put(int milk){
        //如果有牛奶，等待消费
        if (state){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        //如果没有奶，就生产奶
        this.milk = milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶箱");

        //生产完毕之后，修改牛奶的状态
        state = true;

        //唤醒其他等待线程
        notifyAll();
    }

    public synchronized void get(){
        //如果没有奶，等待生产
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有奶就消费
        System.out.println("用户将拿到"+this.milk+"瓶奶");

        //消费完毕后，修改奶箱状态
        state = false;

        //唤醒其他等待线程
        notifyAll();
    }
}
