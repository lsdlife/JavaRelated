package com.net_application.tcp.d3;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标：实现服务端可以同时处理多个客户端的消息的服务端
 */

public class ServerDemo1 {
    public static void main(String[] args) {
        //1.注册端口
        try {
            System.out.println("服务端启动成功");
            ServerSocket serverSocket=new ServerSocket(7777);

            //a.定义一个死循环的主线程负责不断地接收客户端的Socket的管道连接
            while (true) {
                //2.每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取
                Socket socket=serverSocket.accept();
                //追踪谁上线了
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                //开始创建独立线程处理Socket
                new ServerReadThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
