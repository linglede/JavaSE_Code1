package com.study06;

import java.io.*;
import java.net.Socket;

/**
 * @author 17910
 */
public class ServerThread implements Runnable{
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try{
            //接收数据，写入文本文件

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            //BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaSE_Code\\myNet\\copy.txt"));

            int count = 0;
            File file = new File("D:\\JavaSE_Code\\myNet\\copy["+count+"].txt");
            while (file.exists()){
                count++;
                file = new File("D:\\JavaSE_Code\\myNet\\copy["+count+"].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String line;
            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //给出反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
