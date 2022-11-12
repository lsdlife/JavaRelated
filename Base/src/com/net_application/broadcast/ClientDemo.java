package com.net_application.broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws Exception{
        System.out.println("。。。。。。。。客户端启动了。。。。。。。。");
        //1.创建发送端对象,发送端自带默认端口(人）
        DatagramSocket sender=new DatagramSocket();
        //2.创建一个数据包对象（韭菜盒子）
//          DatagramPacket(byte buf[], int offset, int length,
//                                    InetAddress address, int port)
//                   参数一：封装要发送的数据（韭菜）
//                    参数二：发送数据的大小
//                    参数三：服务端的IP地址

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg=sc.nextLine();
            if("exit".equals(msg)){
                System.out.println("离线成功");
                sender.close();
                break;
            }
            byte buffer[]=msg.getBytes();
            DatagramPacket packet=new DatagramPacket(buffer,buffer.length,
                    InetAddress.getByName("255.255.255.255"),9999);
            //发送数据出去
            sender.send(packet);
        }
        //sender.close();
    }
}
