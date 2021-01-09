package com.study_07;

public class Preson {
    private String name;
    private int age;

    //快捷键Alt+insert
    public Preson() {
    }

    public Preson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
