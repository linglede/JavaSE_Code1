package com.study03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(12345);
        while (true) {
            //创建一个数据包，接受数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            ds.receive(dp);

            //解析数据
            System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }
       // ds.close();
    }
}
