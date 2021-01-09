package com.study_07;

public class Demo {
    public static void main(String[] args) {
        //创建老师类对象并进行测试
        Teacher t1 = new Teacher();
        t1.setName("林青霞");
        t1.setAge(30);

        System.out.println(t1.getName()+","+t1.getAge());

        t1.teach();

        Teacher t2 = new Teacher("fe",20);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();


        Student s = new Student();
        s.setName("ada");
        s.setAge(20);

        System.out.println(s.getName()+","+s.getAge());
        s.study();

        Student s2 = new Student("fe11",20);
        System.out.println(s2.getName()+","+s2.getAge());
        s2.study();

    }
}
