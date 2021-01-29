package com.study01;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {
    public static void main(String[] args)throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\JavaSE_Code\\myByteStream\\fos.txt");

        //写数据
        for (int i=0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }

        //释放资源
        fos.close();
    }
}
