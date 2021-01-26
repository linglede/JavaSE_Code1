package com.study02;

public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("ada",22);

        //同一对象多次调用hashCode方法返回的哈希值是相同的
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("------------");

        //默认情况下不同对象的哈希值是不相同的
        //通过方法重写，可以实现不同对象的哈希值是相同的
        Student s2 = new Student("ada",22);
        System.out.println(s2.hashCode());
        System.out.println("==========");

        System.out.println("hello".hashCode());
        System.out.println("eeee".hashCode());
        System.out.println("eeee".hashCode());
        System.out.println("-----------");

        System.out.println("通话".hashCode());
        System.out.println("重地".hashCode());
        System.out.println("秘密".hashCode());
    }
}
