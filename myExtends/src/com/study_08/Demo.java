package com.study_08;

public class Demo {
    public static void main(String[] args) {
        //创建猫类对象并进行测试
        Cat c1 = new Cat();
        c1.setName("短毛猫");
        c1.setAge(2);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catchMouse();

        Cat c2 =new Cat("布偶猫",2);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catchMouse();


        //创建狗类对象并进行测试
        Dog d1 = new Dog();
        d1.setName("柴犬");
        d1.setAge(2);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.lookDog();

        Dog d2 =new Dog("拉布拉多",2);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.lookDog();
    }
}
