package com.net_application.tcp.d1;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 完成Socket网络编程入门案例的客户端开发，一发一收
 */

public class ClientDemo1 {
    public static void main(String[] args) {
        /**
         * 参数一：服务端的ip地址
         * 参数二:服务端的端口
         */
        try {
            System.out.println("客户端启动成功");
            //1.创建Socket通信管道请求有服务端的连接
            Socket socket=new Socket("127.0.0.1",7777);

            //2.从socket通信管道中得到一个字节输出流，负责发送数据
            OutputStream os=socket.getOutputStream();

            //3.把低级的字节流包装成打印流
            PrintStream ps=new PrintStream(os);

            //4.发送消息
            //ps.print("我是tcp的客户端，已与你对接，并发出邀请：约吗");
            ps.println("我是tcp的客户端，已与你对接，并发出邀请：约吗");
            ps.flush();
            //关闭资源
            //socket.close();   //如果直接关闭的话就直接没有报错了
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
