package com.study02;

import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("D:\\JavaSE_Code\\myByteStream\\myCharStream\\sow.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\JavaSE_Code\\myByteStream\\myCharStream\\sow.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\JavaSE_Code\\myByteStream\\myCharStream\\sow.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\JavaSE_Code\\myByteStream\\myCharStream\\sow.txt"),"GBK");

        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\JavaSE_Code\\myByteStream\\myCharStream\\sow.txt"),"GBK");

        //一次读取一个数据
        int ch;
        while ((ch= isr.read())!=-1){
            System.out.print((char)ch);
        }
        isr.close();
    }
}
