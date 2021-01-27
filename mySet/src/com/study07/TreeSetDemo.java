package com.study07;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //主要条件
                int num = (s2.getsum()) - (s1.getsum());
               //次要条件
                int num2 = num==0?(s1.getChinese()-s2.getChinese()):num;
                int num3 = num2==0?(s1.getName().compareTo(s2.getName())):num2;
                return num3;
            }
        });

        //创建学生对象
        Student s1 = new Student("aaa",98,100);
        Student s2 = new Student("bbb",95,95);
        Student s3 = new Student("ccc",100,93);
        Student s4 = new Student("ddd",100,97);
        Student s5 = new Student("eee",98,98);

        Student s6 = new Student("fff",97,99);
        Student s7 = new Student("ggg",97,99);

        //添加学生对象到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        //遍历集合
        for(Student s:ts){
            System.out.println(s.getName()+","+s.getChinese()+","+s.getMath()+","+s.getsum());
        }


    }
}
