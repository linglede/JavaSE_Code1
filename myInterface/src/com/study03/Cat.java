package com.study03;

public class Cat extends Animal implements Jumpping {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void jump() {
        System.out.println("猫可以跳高");
    }
}
