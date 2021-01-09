package com.study_03;

public class Student01 {
    private String name;
    private String age;

    public Student01(){}
    public Student01(String name,String age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

}
