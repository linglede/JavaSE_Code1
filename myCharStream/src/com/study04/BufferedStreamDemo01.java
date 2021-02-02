package com.study04;

import java.io.*;

public class BufferedStreamDemo01 {
    public static void main(String[] args)throws IOException {
        //BufferedWriter(Writer out)
//        FileWriter fw = new FileWriter("D:\\JavaSE_Code\\myByteStream\\myCharStream\\bw.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaSE_Code\\myByteStream\\myCharStream\\bw.txt"));
//        bw.write("hello\r\n");
//        bw.write("world\r\n");
//        bw.write("xxxx\r\n");
//
//        bw.close();

        BufferedReader bf = new BufferedReader(new FileReader("D:\\JavaSE_Code\\myByteStream\\myCharStream\\bw.txt"));

        //一次读一个字符数据
//        int ch;
//        while ((ch=bf.read())!=-1){
//            System.out.print((char)ch);
//        }

        //一次读一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len=bf.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }

        bf.close();
    }
}
