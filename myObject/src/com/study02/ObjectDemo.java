package com.student02;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("csdf");
        s1.setAge(22);

        Student s2 = new Student();
        s2.setName("csdf");
        s2.setAge(22);

        //需求：比较两个对象的内容是否相同
        //s1,s2代表地址值
        System.out.println(s1 == s2);

        //重写equals方法
        System.out.println(s1.equals(s2));

    }
}
