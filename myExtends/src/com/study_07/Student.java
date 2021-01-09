package com.study_07;

public class Student extends Preson {

    public Student(){}

    public Student(String name,int age){
        super(name, age);
    }

    public void study(){
        System.out.println("好好学习，天天向上");
    }
}
