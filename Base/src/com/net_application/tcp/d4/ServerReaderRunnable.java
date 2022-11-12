package com.net_application.tcp.d4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 使用线程池优化实现通信的服务端
 * 线程处理程序
 */

public class ServerReaderRunnable implements  Runnable{
    private Socket socket;
    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //3.从socket通信管道中得到字节输入流
        try {
            InputStream is = socket.getInputStream();
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
