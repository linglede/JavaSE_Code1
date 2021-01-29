package com.study01;

/*
* 方法名	说明
public boolean isDirectory()	测试此抽象路径名表示的file是否为目录
public boolean isFile()	测试此抽象路径名表示的file是否为文件
public boolean exists()	测试此抽象路径名表示的 File 是否存在
public String getAbsolutePath()	返回此抽象路径名的绝对路径名字符串
public String getPath()	将此抽象路径名转换为路径字符串
public String getName()	 返回由此路径名表示的文件或目录名称
public String[] list()	返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
pubic File[] listFiles()	返回此抽象路径名表示的目录的文件和File对象数姐
* */

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        //创建一个File对象
        File f = new File("D:\\JavaSE_Code\\myFile\\java1.txt");

        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());

        File f2 = new File("D:\\JavaSE_Code");
        String[] strArray = f2.list();

        for (String str:strArray){
            System.out.println(str);
        }

        File[] fileArray = f2.listFiles();
        for (File file : fileArray){
           // System.out.println(file);
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
