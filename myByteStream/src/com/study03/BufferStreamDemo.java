package com.study03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferStreamDemo {
    public static void main(String[] args)throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\JavaSE_Code\\myByteStream\\fos.txt"));
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }

        bis.close();

    }
}
