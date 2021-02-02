package com.study08;

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException{
        //创建数据源目录File对象，此处路径乱写的
        File srcFile = new File("E:\\it");

        //创建目的地目录对象，路径名是模块名+it组成
        File destFile = new File("F:\\");

        //写方法实现文件夹复制
        copyFolders(srcFile,destFile);

    }

    public static void copyFolders(File srcFile,File destFile)throws IOException{
        //判断数据源File是否是目录
        if (srcFile.isDirectory()){
            //在目的地下创建和数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile,srcFileName);
            //F:\\it

            if (!newFolder.exists()){
                srcFile.mkdir();
            }

            //获取数据源File下的所有文件或目录
            File[] fileArray = srcFile.listFiles();

            //遍历
            for (File file:fileArray){
                copyFolders(file,newFolder);
            }
        }else {
            //说明是文件，直接复制
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }


    //字节缓冲流复制文件

    public static void copyFile(File srcFile, File destFile )throws IOException {
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
