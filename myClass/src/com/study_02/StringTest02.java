package com.study_02;

import java.util.Scanner;

/**
 * @author 17910
 */
public class StringTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //遍历字符串，获得字符串长度

        for(int i=0;i<line.length();i++){
            System.out.println(line.charAt(i));
        }
    }
}
