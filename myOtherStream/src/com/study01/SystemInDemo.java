package com.study01;

import java.io.*;

public class SystemInDemo {
    public static void main(String[] args)throws IOException {
        //public static final InputStream in :标准输入流
      //  InputStream is = System.in;

//        int by;
//        while ((by=is.read())!=-1){
//            System.out.print((char)by);
//        }

        //如何把字节流转换为字符流
//        InputStreamReader isr = new InputStreamReader(is);
//        //一次读取一行数据的方法是字符缓冲输入流的特有方法
//        BufferedReader bis = new BufferedReader(isr);
//
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串：");
        String line = br.readLine();
        System.out.println(line);

        System.out.println("请输入一个整数");
        int i = Integer.parseInt(br.readLine());
        System.out.println(i);

    }
}
