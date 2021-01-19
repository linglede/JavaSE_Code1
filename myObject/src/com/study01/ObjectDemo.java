package com.student01;


/*
*    看方法的源码，选中方法，ctrl+B
*
*    建议所有子类重写此方法toString(自动生成即可)
* */

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(3);
        System.out.println(s);
        System.out.println(s.toString());
    }
}
