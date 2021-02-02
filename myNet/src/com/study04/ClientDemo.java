package com.study04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        //Socket s = new Socket(InetAddress.getByName("192.168.1.5"),10000);
        Socket s = new Socket("192.168.1.5",10000);

        //获取输出流写数据
        OutputStream os = s.getOutputStream();
        os.write("helloTCP,wolailw".getBytes());

        //接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端："+data);

        //释放资源
        s.close();

    }
}
