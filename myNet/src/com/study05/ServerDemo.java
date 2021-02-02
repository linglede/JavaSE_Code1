package com.study05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        //Socket accept():侦听要连接到此套接字并接受他
        Socket s = ss.accept();

        //获取输入流，读数据
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
       // BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaSE_Code\\myNet\\s.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaSE_Code\\myNet\\copy.txt"));

        String line;
        while ((line=br.readLine())!=null) {
//            if ("886".equals(line)) {
//                break;
//            }
                bw.write(line);
                bw.newLine();
                bw.flush();

        }

        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        bw.close();
        ss.close();
    }
}
