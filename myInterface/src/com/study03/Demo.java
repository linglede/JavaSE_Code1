package com.study03;

public class Demo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(1);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("布偶",2);
        System.out.println(a.getName()+","+a.getAge());
        ((Cat) a).jump();

        Cat c = new Cat();
        c.setName("niuniu");
        c.setAge(1);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
    }
}
