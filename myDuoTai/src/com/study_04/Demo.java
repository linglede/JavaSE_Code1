package com.study_04;

public class Demo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("短毛猫");
        a.setAge(2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("布偶",2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        //创建狗类对象进行测试
        Animal dog = new Dog();
        dog.setName("柴犬");
        dog.setAge(2);
        System.out.println(dog.getName()+","+dog.getAge());
        dog.eat();

        dog = new Dog("金毛",2);
        System.out.println(dog.getName()+","+dog.getAge());
        dog.eat();
    }
}
