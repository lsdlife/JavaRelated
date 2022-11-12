package com.net_application.tcp.d2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP 实现多收多发的服务端
 * 本质上还是多发一收
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
            while ((msg = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + " 说了：" + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
