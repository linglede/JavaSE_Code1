package com.study06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //创建list集合对象
        List<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("sds",11);
        Student s2 = new Student("dedef",33);
        Student s3 = new Student("dwdf",22);

        //把学生添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }

        //普通for循环
        for (int i=0;i<list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

        //增强for循环

        for (Student s:list){
            System.out.println(s.getName()+","+s.getAge());
        }
   }
}
