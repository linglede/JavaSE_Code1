package com.study02;


import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\JavaSE_Code\\myByteStream\\fos.txt");

        //调用字节输入流对象的读数据方法
       // byte[] by = new byte[5];

        //第一次读取数据
        //int read(byte[] b):从该输入流读取最多b.length个字节的数据到一个字节数组
        /*int len = fis.read(by);
        System.out.println(len);
        //System.out.println(new String(by));
        System.out.println(new String(by,0,len));
*//*
*     第一次：hello
*     第二次:\r\nhel
*     第三次：lo\r\nh
*
* *//*
        len = fis.read(by);
        System.out.println(len);
        System.out.println(new String(by,0,len));

        len = fis.read(by);
        System.out.println(len);
        System.out.println(new String(by,0,len));
*/
        byte[] bys = new byte[1024];
        //大小填1024及其整数倍
        int len;
        while ((len=fis.read(bys))!=-1){
            System.out.print(new java.lang.String(bys,0,len));

        }



        //释放资源
        fis.close();
    }
}
