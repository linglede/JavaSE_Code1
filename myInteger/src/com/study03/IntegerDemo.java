package com.study03;


/*int String相互转换*/
public class IntegerDemo {
    public static void main(String[] args) {
        //int---String
        int num = 100;
        //方法1
        String s = ""+num;
        System.out.println(s);

        //方法2
        String s2 = String.valueOf(num);
        System.out.println(s2);

        //String--int

        String s3 = "101";
        //方法1：String---Integer--int
        Integer i = Integer.valueOf(s3);
        int x = i.intValue();
        System.out.println(x);

        //方法2
        int y = Integer.parseInt(s3);
        System.out.println(y);
    }
}
