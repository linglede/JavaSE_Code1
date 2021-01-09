package com.study_01;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGames(){
        System.out.println("猫捉迷藏");
    }
}
