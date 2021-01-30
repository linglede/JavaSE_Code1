package com.study01;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("D:\\JavaSE_Code\\myOtherStream\\ps.txt");

        //字节输出流方法
        ps.write(97);

        ps.print(98);
        ps.println(97);

        ps.close();
    }
}
