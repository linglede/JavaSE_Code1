package com.study_01;


/*
* 多态的前提和引用
	有继承/实现关系
	有方法重写
	有父类引用指向子类对象
* */


/*	向上转型
        从子到父
        父类引用指向子类对象
	向下转型
        从父到子
        父类引用转为子类对象
*/

public class Demo {
    public static void main(String[] args) {
        //向上转型
        Animal a = new Cat();
        a.eat();
        //编译看左边，执行看右边


        //向下转型
        Cat c = (Cat)a;
        c.playGames();
        //或者直接
        ((Cat) a).playGames();
    }
}
