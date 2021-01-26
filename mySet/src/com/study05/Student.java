package com.study05;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        //按年龄大小进行排序
        int num = this.age - o.age;
        int num2=num==0?this.name.compareTo(o.name):num;
        return num2;

        /*num等于0 不重复
        * num大于0 升序
        * num小于0 降序*/
    }
}
