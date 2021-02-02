package com.study01;

import java.net.InetAddress;
import java.net.UnknownHostException;
886
public class InterAdderssDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress addresses = InetAddress.getByName("192.168.1.5");

        //获取此ip地址主机名
        String name = addresses.getHostName();

        //返回中文显示中的ip地址字符串
        String ip = addresses.getHostAddress();

        System.out.println(name);
        System.out.println(ip);
    }
}
