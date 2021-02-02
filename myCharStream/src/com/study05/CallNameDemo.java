package com.study05;

/*
* 需求：我有一个文件里面存储了班级同学的姓名，一个姓名占一行，要求通过程序实现随机点名器
* */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\JavaSE_Code\\myByteStream\\myCharStream\\name.txt"));

        ArrayList<String> array = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }

        br.close();

        //使用Random产生一个随机数，随机数的范围在：[0,集合的长度}
        Random r = new Random();
        int index = r.nextInt(array.size());

        String name = array.get(index);

        System.out.println("点到名字的是"+name);

    }
}
