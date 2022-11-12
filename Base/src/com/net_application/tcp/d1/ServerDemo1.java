package com.net_application.tcp.d1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标：开发Socket网络编程入门代码的服务器，实现接收消息
 */
public class ServerDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("服务端启动成功");
            //1.注册端口
            ServerSocket serverSocket=new ServerSocket(7777);

            //2.调用accept方法等待接收客户端的Socket连接请求，建立Socekt通信管道
            Socket socket=serverSocket.accept();

            //3.从socket通信管道中得到字节输入流
            InputStream is=socket.getInputStream();

            //4.把字节输入流包装成缓冲字符输入流进行消息读取
            BufferedReader br=new BufferedReader(new InputStreamReader(is));

            //5.按行读取
            String msg;
            if ((msg = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + " 说了：" + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
