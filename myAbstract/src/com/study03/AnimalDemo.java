package com.study03;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("短毛猫");
        a.setAge(2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("布偶",1);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Animal d = new Dog();
        d.setName("金毛");
        d.setAge(2);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();

        d = new Dog("柴犬",1);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
}
}
