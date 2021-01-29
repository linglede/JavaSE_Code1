package com.study03;

import java.io.*;

public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        //复制视频
        //method1();
        //method2();
        //method3();
        //method4();

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime));
    }

    //基本字节流一次读写一个字节数组
  /*  public static void method02() throws IOException{
        FileInputStream fis = new FileInputStream("D:\\it\\ds.avi");
        FileOutputStream fos = new FileOutputStream("D:\\JavaSE_Code\\ds.avi");

        byte[] bys = new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        fos.close();
        fis.close();
    }*/

    //基本字节流一次读写一个字节
    /*public static void method1() throws IOException{
        FileInputStream fis = new FileInputStream("D:\\it\\ds.avi");
        FileOutputStream fos = new FileOutputStream("D:\\JavaSE_Code\\ds.avi");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }

        fos.close();
        fis.close();
    }*/

    //字节缓冲流一次读写一个字节
    /*public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\it\\ds.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\JavaSE_Code\\ds.avi"));

        int by;
        while ((by=bis.read())!=-1){
            bos.write(by);
        }

        bos.close();
        bis.close();
    }*/

    //字节缓冲流一次读写一个字节数组
/*    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\it\\ds.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\JavaSE_Code\\ds.avi"));


        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bos.close();
        bis.close();
    }*/
}