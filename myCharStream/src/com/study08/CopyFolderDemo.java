package com.study08;

import java.io.*;


public class CopyFolderDemo {
    public static void main(String[] args) throws IOException{
        //创建数据源目录File对象，此处路径乱写的
        File srcFolder = new File("E:\\it");

        //获取源数据目录对象的名称it
        String srcFolderName = srcFolder.getName();

        //创建目的地目录对象，路径名是模块名+it组成
        File destFolder = new File("myCharStream",srcFolderName);

        //判断目的地目录对应的file是否存在，如不存在创建
        if (!destFolder.exists()){
            destFolder.mkdir();
        }

        //获取数据源目录下所有文件

        File[] files = srcFolder.listFiles();

        //遍历file数组，得到每一个file对象，该对象，就是数据源文件
        for (File srcFile :files){
            String srcFileName = srcFile.getName();
            //创建目的地文件对象
            File destFile = new File(destFolder,srcFileName);
            //复制文件
            copyFile(srcFile,destFile);
        }

    }

    public static void copyFile(File srcFile,File destFile )throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }
}
