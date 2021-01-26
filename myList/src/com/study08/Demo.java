package com.study08;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        //创建学生对象
        //创建学生对象
        Student s1 = new Student("sds",11);
        Student s2 = new Student("dedef",33);
        Student s3 = new Student("dwdf",22);

        //把学生添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合
        Iterator<Student> it = array.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }

        System.out.println("--------");

        for (Student s:array){
            System.out.println(s.getName()+","+s.getAge());
        }

        System.out.println("----------");

        for (int i=0;i<array.size();i++){
            Student ss = array.get(i);
            System.out.println(ss.getName()+","+ss.getAge());
        }
    }
}
