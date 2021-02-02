package com.study03;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
      //  InputStreamReader isr =new InputStreamReader(new FileInputStream("D:\\JavaSE_Code\\myByteStream\\myCharStream\\ConversionStreamDemo.java"));
       // OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\JavaSE_Code\\myByteStream\\myCharStream\\Copy.java"));

        //一次读写一个字符数据
//        int ch;
//        while ((ch = isr.read())!=-1){
//            osw.write(ch);
//        }

        //一次读写一个字符数组
//        char[] chs = new char[1024];
//        int len;
//        while ((len=isr.read(chs))!=-1){
//            osw.write(chs,0,len);
//        }
//
//        isr.close();
//        osw.close();

        //改进版
        FileReader fr = new FileReader("D:\\JavaSE_Code\\myByteStream\\myCharStream\\ConversionStreamDemo.java");
        FileWriter fw = new FileWriter("D:\\JavaSE_Code\\myByteStream\\myCharStream\\Copy.java");

        int ch;
        while ((ch = fr.read())!=-1){
            fw.write(ch);
        }

        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }


        //释放资源
        fr.close();
        fw.close();




    }
}
