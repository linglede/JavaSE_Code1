package com.study06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\JavaSE_Code\\myByteStream\\myCharStream\\array.txt"));

        ArrayList<Student> array = new ArrayList<>();

        //调用字符缓冲输入流方法读取数据
        String line;
        while ((line = br.readLine()) != null) {
            //把读取到的字符串数据用split（）进行分割，得到一个字符串数组
            String[] strArray = line.split(",");

            //创建学生对象
            Student s = new Student();
            s.setSid(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));
            s.setAddress(strArray[3]);

            array.add(s);
        }

        br.close();

        for (Student s : array) {

            System.out.println(s.getSid() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
        }
    }
}