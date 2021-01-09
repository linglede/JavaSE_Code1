package com.study_03;

import java.util.ArrayList;

public class ArrayListDemo04 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("vrgr",31);
        Student s3 = new Student("林efe霞",34);

        //添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合，采用通用格式遍历
        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
