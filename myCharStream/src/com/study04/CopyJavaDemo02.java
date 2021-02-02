package com.study04;

import java.io.*;

public class CopyJavaDemo02 {
    public static void main(String[] args)throws IOException {
        //根据数据源创建字符缓冲输入流对象
        BufferedReader br =new BufferedReader(new FileReader("D:\\JavaSE_Code\\myByteStream\\myCharStream\\bw.txt"));
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaSE_Code\\myByteStream\\myCharStream\\copy.txt"));

        //读写数据
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
