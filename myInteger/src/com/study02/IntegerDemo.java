package com.study02;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        System.out.println(i1);

        Integer i2 = new Integer("100");
        System.out.println(i2);

        Integer i3 = Integer.valueOf(101);
        System.out.println(i3);

        Integer i4 = Integer.valueOf("111");
        System.out.println(i4);
    }
}
