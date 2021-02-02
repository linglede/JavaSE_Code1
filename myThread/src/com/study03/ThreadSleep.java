package com.study03;

public class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0 ;i<50;i++){
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
