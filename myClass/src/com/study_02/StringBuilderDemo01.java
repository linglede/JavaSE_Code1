package com.study_02;

/**
 * @author 17910
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //1.	StringBuilder转换为String
        /*StringBuilder sb = new StringBuilder();
        sb.append("hello");

        String s = sb.toString();
        System.out.println(s);*/


        String s = "hello";

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
    }
}
