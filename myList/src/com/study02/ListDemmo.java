package com.study02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemmo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("def",32);
        Student s2 = new Student("frf",11);
        Student s3 = new Student("defd",12);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器方式
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }

        //for循环方式
        for (int i = 0;i<list.size();i++){
            Student student = list.get(i);
            System.out.println(student.getName()+","+student.getAge());
        }
    }
}
