package com.study_02;

import java.util.Scanner;

/**
 * @author 17910
 */
public class StringBuilderDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        String s = myReverse(line);

        System.out.println(s);

    }

    //定义一个方法，实现字符串反转。返回值类型String,参数String s

    public static String myReverse(String s){

        return new StringBuilder(s).reverse().toString();
    }
}
