package com.study_02;

/**
 * @author 17910
 */
/*
*   public StringBuilder append(任意类型) 	添加数据，并返回对象本身
*   public StringBuilder reverse()	返回相反的字符序列
* */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        /*sb.append("hello");
        sb.append("java");
        sb.append(100);
        */
        //链式编程

        sb.append("hello").append("java").append(100);
        System.out.println("sb:"+sb);


        //public StringBuilder reverse()	返回相反的字符序列

        sb.reverse();
        System.out.println("sb:"+sb);
    }
}
