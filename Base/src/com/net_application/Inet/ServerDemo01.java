package com.net_application.Inet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP接收端  只能接受一个
 */

public class ServerDemo01 {
    public static void main(String[] args) throws   Exception {
        System.out.println("。。。。。。。。服务端启动了。。。。。。。。");
        //1.创建服务器对象，注册端口（人），不注册会通信失败
        DatagramSocket server=new DatagramSocket(8888);

        //2.创建一个数据包对象（韭菜盘子）接收数据
        byte buffer[]=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length);

        //3.等到接收数据即可
        server.receive(packet);

        //4.取出数据
        //读取多少倒出多少
        int length=packet.getLength();
        String ts=new String(buffer,0,length);
        System.out.println("收到了" + ts);

        //获取发送端的端口和ip
        String senderip=packet.getSocketAddress().toString();
        System.out.println("对方ip:" + senderip);
        int senderport=packet.getPort();
        System.out.println("对方端口:" + senderport);

        //关闭管道
        server.close();
    }
}
