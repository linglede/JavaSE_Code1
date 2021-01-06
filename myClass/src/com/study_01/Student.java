package com.study_01;

/**
 * @author 17910
 */
public class Student {
    //成员变量

    private int age;
    String name;


    //提供get/set方法


    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("年龄有误");
        } else {
            this.age = age;
            }
    }

    public int getAge() {
        return age;
    }

    //成员方法
    public void study(){
        System.out.println("好好学习，天天向上");
    }
    public void doHomework(){
        System.out.println("敲键盘");
    }
}
