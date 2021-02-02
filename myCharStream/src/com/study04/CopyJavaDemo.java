package com.study04;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符缓冲流对象
        BufferedReader bf = new BufferedReader(new FileReader("D:\\JavaSE_Code\\myByteStream\\myCharStream\\ConversionStreamDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaSE_Code\\myByteStream\\myCharStream\\Copy.java"));

//        int ch;
//        while ((ch=bf.read())!=-1){
//            bw.write(ch);
//        }
//

        char[] chs = new char[1024];
        int len;
        while ((len=bf.read(chs))!=-1){
            bw.write(chs,0,len);
        }

        bf.close();
        bw.close();
    }
}
