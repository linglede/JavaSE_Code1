package com.study07;

/*
需求：键盘录入五个学生信息（姓名，语文成绩，数学成绩，英语成绩），要求按照成绩总分从高到低写入文件

* */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        //创建TreeSet集合，通过比较器排序进行比较
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum()-s1.getSum();
                int num2 = num==0?s1.getChinese()-s2.getChinese():num;
                int num3 = num2==0?s1.getMath()-s2.getMath():num;
                int num4 = num3==0?s1.getEnglish()-s2.getEnglish():num;
                return num4;
            }
        });

        //键盘录入5个同学数据
        for (int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第"+(i+1)+"个学生信息：" );
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            //创建学生对象
            Student s =new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            //把学生对象添加到TreeSet
            ts.add(s);
        }

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaSE_Code\\myByteStream\\myCharStream\\array.txt"));

        //遍历集合
        for (Student s :ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());

            //写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();

    }
}
