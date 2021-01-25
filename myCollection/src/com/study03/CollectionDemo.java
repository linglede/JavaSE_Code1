package com.study03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 17910
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("ada",11);
        Student s2 = new Student("wew",17);
        Student s3 = new Student("vff",15);

        //把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);

        //遍历集合
        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student s4 = it.next();
            System.out.println(s4.getName()+","+s4.getAge());
        }


    }
}
