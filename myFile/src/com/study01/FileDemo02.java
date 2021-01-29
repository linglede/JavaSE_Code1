package com.study01;
/*方法名	说明
public boolean createNewFile()	当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
public boolean mkdir()	创建由此抽象路径名命名的目录
public boolean mkdirs()	创建由此抽象路径名命名的目录，包括任何必须但不存在的父目录

* */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\JavaSE_Code\\java.txt");
        System.out.println(f1.createNewFile());
        //删除当前目录下的java.txt
        System.out.println(f1.delete());
        System.out.println("-----------");

        File f2 = new File("D:\\JavaSE_Code\\JavaSE");
        System.out.println(f2.mkdir());
        //删除当前模块目录下创建的目录
        System.out.println(f2.delete());
        System.out.println("-----------");

        File f3 = new File("D:\\JavaSE_Code\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());
        System.out.println("-----------");

        File f4 = new File("D:\\JavaSE_Code\\javase.txt");
        System.out.println(f4.createNewFile());

        File f5 = new File("D:\\JavaSE_Code\\myFile\\itcast");
        System.out.println(f5.mkdir());
        File f6 = new File("D:\\JavaSE_Code\\myFile\\itcast\\java.txt");
        System.out.println(f6.createNewFile());

        System.out.println(f6.delete());
        System.out.println(f5.delete());




    }
}
