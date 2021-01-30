package com.study01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
    //    PrintWriter pw = new PrintWriter("D:\\JavaSE_Code\\myOtherStream\\pw.txt");
//
//        pw.write("hello");
//        pw.flush();
//        pw.write("\r\n");
//
//        pw.write("hello");
//        pw.flush();
//        pw.write("\r\n");

//        pw.println("hello fefe");
//        pw.flush();

        PrintWriter pw = new PrintWriter(new FileWriter("D:\\JavaSE_Code\\myOtherStream\\pw.txt"),true);

        pw.println("hello world");
        pw.println(34);

        pw.close();
    }
}
