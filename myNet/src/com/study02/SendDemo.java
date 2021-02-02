package com.study02;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
//        byte[] bys = "hello,UDP,wolaile".getBytes();
//        int length = bys.length;
//        InetAddress name = InetAddress.getByName("192.168.1.5");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,name,port);
        byte[] bys = "hello,UDP,wolaile".getBytes();
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.5"),10086);

        //调用DatagramSocket对象的方法发送数据
        ds.send(dp);

        //关闭发送端
        ds.close();
    }
}
