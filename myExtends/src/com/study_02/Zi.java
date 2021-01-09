package com.study_02;

public class Zi extends Fu{
    public int age = 20;

    public void show(){
        int age = 30;
        System.out.println(age);
        //要访问本类的成员变量age,怎么办？
        System.out.println(this.age);
        //访问父类成员变量
        System.out.println(super.age);
    }
}
