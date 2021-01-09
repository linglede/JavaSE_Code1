package com.study_07;

public class Teacher extends Preson {
    public void teach(){
        System.out.println("用爱成就每一位学生");
    }

    public Teacher(){}
    public Teacher(String name,int age){
        super(name, age);
    }
}
