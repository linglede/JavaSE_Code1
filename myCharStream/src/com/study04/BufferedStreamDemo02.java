package com.study04;

import java.io.*;

public class BufferedStreamDemo02 {
    public static void main(String[] args)throws IOException {
        //创建字符缓冲输出流
       // BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaSE_Code\\myByteStream\\myCharStream\\bw.txt"));

        //写数据
//        for (int i=0;i<10;i++){
//            bw.write("hello"+i);
//            //bw.write("\r\n");
//            bw.newLine();
//            bw.flush();
//        }

        //创建字符缓冲输入流
        BufferedReader bf = new BufferedReader(new FileReader("D:\\JavaSE_Code\\myByteStream\\myCharStream\\bw.txt"));

        //第一次读取数据
//        String line = bf.readLine();
//        System.out.println(line);
//
//        //第二次读取数据
//        line = bf.readLine();
//        System.out.println(line);
//        //第三次读取数据
//        line = bf.readLine();
//        System.out.println(line);


        String line;
        while ((line=bf.readLine())!=null){
            System.out.println(line);
        }

        bf.close();

    }
}
