package com.study_01;

public class StaticDemo {
    public static void main(String[] args) {

        Student.university = "THU";

        Student s1 = new Student();
        s1.name = "ada";
        s1.age = 30;
        //s1.university="THU";
        s1.show();

        Student s2 = new Student();
        s1.name = "asde";
        s1.age = 33;
       // s1.university="THU";
        s1.show();
    }
}
