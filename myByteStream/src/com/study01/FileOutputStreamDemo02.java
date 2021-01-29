package com.study01;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
    public static void main(String[] args)throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\JavaSE_Code\\myByteStream\\fos.txt");

        //byte[] getBytes():返回字符串对应的数组
        byte[] bys = "abcd".getBytes();

        //void write(byte[] b,int off,int len):将len字节从指定的字节数组开始，从偏移量为off的位置开始。
        fos.write(bys,1,3);
        //结果为bcd

        //释放资源
        fos.close();
    }
}
