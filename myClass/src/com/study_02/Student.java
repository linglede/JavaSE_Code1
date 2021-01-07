package com.study_02;

/**
 * @author 17910
 */
public class Student {
    private String name;
    private int age;

    //构造方法
    public Student(){
        System.out.println("无参构造方法");
    }

    public Student(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(name+","+age);
    }

}
