package com.study02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyJpgDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建输入流对象，地址乱写的
        FileInputStream fis = new FileInputStream("E:\\it\\mn.jpg");

        FileOutputStream fos = new FileOutputStream("D:\\JavaSE_Code\\mn.jpg");

        //读写数据，复制图片
        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}
