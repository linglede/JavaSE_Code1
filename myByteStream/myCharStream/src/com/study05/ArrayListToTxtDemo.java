package com.study05;

/*
  需求：把ArrayList集合中的字符串数据写入文本文件。要求：每一字符串元素作为文件中的一行数据
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        //创建ArrayList集合
        ArrayList<String> array = new ArrayList<>();

        //往集合中存储字符串元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaSE_Code\\myByteStream\\myCharStream\\array.txt"));

        //遍历结合，得到每一个字符串数据
        for (String s :array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
