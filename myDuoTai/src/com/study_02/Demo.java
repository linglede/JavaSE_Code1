package com.study_02;


/*
* 多态的前提和引用
	有继承/实现关系
	有方法重写
	有父类引用指向子类对象
* */



public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        //成员变量
        System.out.println(a.age);
        System.out.println(((Cat) a).weight);
        //成员方法
        a.eat();
        ((Cat) a).playGames();
    }
}
