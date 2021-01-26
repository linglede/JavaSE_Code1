package com.study03;

import java.util.HashSet;

public class HashSetDemo02 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s = new Student("jqj",11);
        Student s1 = new Student("ere",33);
        Student s2 = new Student("gtg",21);
        Student s3 = new Student("gtg",21);

        hs.add(s);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        //两个相同的对象，在学生类中重写两个方法

        for (Student ws:hs){
            System.out.println(ws.getName()+","+ws.getAge());
        }

    }
}
