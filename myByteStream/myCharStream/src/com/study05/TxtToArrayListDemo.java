package com.study05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\JavaSE_Code\\myByteStream\\myCharStream\\array.txt"));

        //创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<>();

        //调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }

        br.close();

        for (String s:array){
            System.out.println(s);
        }
    }
}
