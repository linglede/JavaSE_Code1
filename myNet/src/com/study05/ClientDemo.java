package com.study05;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.5",10000);

       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("D:\\JavaSE_Code\\myNet\\InterAdderssDemo.java"));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();
        s.shutdownOutput();

        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        //等待读取数据

        System.out.println("服务器的反馈："+data);

        br.close();
        bw.close();
        s.close();

    }

}
