package com.study02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象,路径举例子而已
        FileInputStream fis = new FileInputStream("D:it\\xxx.txt");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:JavaSE_Code\\myByteStream\\xxx.txt");

        //读取数据，复制文本文件
        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}
