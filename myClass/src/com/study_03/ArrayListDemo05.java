package com.study_03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo05 {
    public static void main(String[] args) {
        ArrayList<Student01> array = new ArrayList<>();
        addStudent(array);
        for(int i=0;i<array.size();i++){
            Student01 s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

    }

    public static void addStudent(ArrayList<Student01> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        Student01 s1 = new Student01(name,age);

        array.add(s1);
    }
}
