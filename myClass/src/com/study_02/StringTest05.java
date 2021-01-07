package com.study_02;

import java.util.Scanner;

/**
 * @author 17910
 */
public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入字符串：");

        String line = sc.nextLine();

        String s = reverse(line);
        System.out.println(s);
    }

    public static String reverse(String s){
        //在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成字符串
        String ss = "";

        for(int i=s.length()-1;i>=0;i--){
            ss += s.charAt(i);
        }

        return ss;
    }
}
