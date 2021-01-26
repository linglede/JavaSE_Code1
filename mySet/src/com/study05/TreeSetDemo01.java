package com.study05;

import java.util.TreeSet;

//要求按照年龄从小到大排序，年龄相同的时候，按照姓名字母排序输出

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s = new Student("jqj",11);
        Student s1 = new Student("ere",33);
        Student s2 = new Student("gtg",21);
        Student s3 = new Student("uiu",21);

        Student s4 = new Student("uiu",21);
        ts.add(s);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student s5:ts){
            System.out.println(s5.getName()+","+s5.getAge());
        }
    }
}
