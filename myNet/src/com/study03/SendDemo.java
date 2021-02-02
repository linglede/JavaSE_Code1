package com.study03;


/*UDP发送数据：数据来自键盘，知道输出886，发送数据结束*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=br.readLine())!=null){
            if("886".equals(line)){
                break;
            }

            //创建数据，并把数据打包
            byte[] by = line.getBytes();
            DatagramPacket dp = new DatagramPacket(by,by.length,InetAddress.getByName("192.168.1.5"),12345);

            //发送数据
            ds.send(dp);
           // System.out.println("发送成功");
        }

        ds.close();
    }
}
