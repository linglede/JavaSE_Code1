package com.study06;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                //如果问号前面的逻辑表达式结果是真，那么整个表达式结果等于问号和冒号之间的表达式的计算，否则等于冒号后面的表达式的结果
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;

                return num2;
            }
        });

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
