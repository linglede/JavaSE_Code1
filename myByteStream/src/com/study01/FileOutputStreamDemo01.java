package com.study01;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 17910
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args)throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\JavaSE_Code\\myByteStream\\fos.txt");
        /*
        * 做了三件事：
        * A：调用系统功能创建文件
        * B：创建字节输出流对象
        * C：让字节输出流对象指向创建好的文件
        * */
        //void write(int b):将指定的字节写入此文件输出流
        fos.write(97);

        //释放资源
        fos.close();
    }
}
