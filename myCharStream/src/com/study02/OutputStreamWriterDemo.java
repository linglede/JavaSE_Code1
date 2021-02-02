package com.study02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\JavaSE_Code\\myByteStream\\myCharStream\\sow.txt"));

        //写一个字符
        /*osw.write(97);

//y因为数据存放在缓冲区中，写入文档需要刷新
        //void flush():刷新流
        osw.flush();
        osw.write(98);
        osw.flush();*/

        //写入一个字符数组
        char[] chs = {'a','b','c','d','e'};
        //osw.write(chs);

        //写入字符数组的一部分
      //  osw.write(chs,0,chs.length);
       // osw.write(chs,1,3);

        //写一个字符串
        //osw.write("addfsd");

        //写一个字符串的一部分
//        osw.write("abcde",0,5);
        //osw.write(chs,1,3);

        osw.close();
    }
}
