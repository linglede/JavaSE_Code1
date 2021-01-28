package com.study01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {
        //创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("aaa",14);
        Student s2 = new Student("bbb",31);
        Student s3 = new Student("ccc",11);
        Student s4 = new Student("ddd",22);

        //把学生添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //按照年龄大小排序，年龄相同时，按照姓名的字母进行排序
                int num = s1.getAge()-s2.getAge();
                int num2 = num == 0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        for (Student s :array){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
