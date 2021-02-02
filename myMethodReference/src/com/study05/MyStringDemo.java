package com.study05;

public class MyStringDemo {
    public static void main(String[] args) {
        useMyString((String s,int x,int y)->s.substring(x,y));

        //引用类的实例方法
        useMyString(String::substring);

    }

    private static void useMyString(MyString my){
        String s = my.mySubString("helloworld", 2, 5);
        System.out.println(s);
    }
}
