package com.study01;

/*方法名	说明
 File ( String pathname)	通过将给定的路径名字符串转换为抽象路径名来创建新的 File 实例
 File ( String parent , String child)	从父路径名字符串和子路径名字符串创建新的File实例
  File ( File parent ,String child )	从父抽象路径名和子路径名字符串创建新的 File实例
*/

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File f1 = new File("D:\\JavaSE_Code\\java.txt");
        System.out.println(f1);

        File f2 = new File("D:\\JavaSE_Code","java.txt");
        System.out.println(f2);

        File f3 = new File("D:\\JavaSE_Code");
        File f4 = new File(f3,"java.txt");
        System.out.println(f4);
    }
}
