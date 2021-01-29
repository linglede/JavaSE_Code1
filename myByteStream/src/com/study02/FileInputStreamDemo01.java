package com.study02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\JavaSE_Code\\myByteStream\\fos.txt");

        //调用字节输入流对象的读数据方法
//        int by1 = fis.read();
//        System.out.println((char) by1);

        //优化后

        int by;
        while ((by=fis.read())!=-1){
            System.out.print((char)by);
        }


        fis.close();
    }
}
