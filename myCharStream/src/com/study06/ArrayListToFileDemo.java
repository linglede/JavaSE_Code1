package com.study06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("001","aaa",22,"江西");
        Student s2 = new Student("002","ccc",11,"天津");
        Student s3 = new Student("003","bbb",32,"北京");

        //添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaSE_Code\\myByteStream\\myCharStream\\array.txt"));

        //遍历集合，得到每一个学生对象
        for (Student s:array){
            //把学生对象的数据拼接成指定格式字符串
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            //调用字符缓冲输出流对象的方法写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
