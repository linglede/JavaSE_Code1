package com.study04;

public class Demo {
    public static void main(String[] args) {
        //装箱
        Integer i = Integer.valueOf(100);
        System.out.println(i);
        //自动装箱
        Integer i1 = 10;

        //拆箱

        i1 = i1.intValue() + 200;
        System.out.println(i1);
        //自动拆箱
        i1 += 200;
        System.out.println(i1);

        Integer iii = null;
        if (iii != null){
            iii += 300;
            System.out.println(iii);
        }
    }
}
