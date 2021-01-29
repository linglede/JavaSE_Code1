package com.study01;

import java.io.File;

public class DiGuiDemo03 {
    public static void main(String[] args) {
        //根据给定的路径创造一个File对象
        File srcFile = new File("D:\\JavaSE_Code");

        //调用方法
        getAllFilePath(srcFile);
    }

    //定义一个方法，用于获取给定目录下的所有内容，参数为第一部创建的File对象

    public static void getAllFilePath(File srcFile){
        //获取给定的File目录下所有的文件或者目录的File数组
        File[] fileArray = srcFile.listFiles();
        //遍历该File数组，得到每一个File对象
        if (fileArray!=null){
            for (File file:fileArray){
                //判断该File对象是否是目录
                if (file.isDirectory()){
                    getAllFilePath(file);
                }else {
                    System.out.println(file.getPath());
                }
            }
        }

    }
}
