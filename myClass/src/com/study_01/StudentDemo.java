package com.study_01;

/**
 * @author 17910
 */
    /*多对象指向相同*/
public class StudentDemo {
    public static void main(String[] args) {
        //创建一个对象

        Student student = new Student();

        //使用对象


        student.name = "刘亦菲";
        //student.age = 30;
        //student.setAge(-30);
        student.setAge(20);
        System.out.println(student.name+","+student.getAge());

        student.study();
        student.doHomework();

        //把第一个对象的地址值付给第二个对象
        Student s2 = student;
        s2.name = "张曼玉";
        s2.setAge(38);
        System.out.println(student.name+","+student.getAge());
        System.out.println(s2.name+","+s2.getAge());
    }
}
