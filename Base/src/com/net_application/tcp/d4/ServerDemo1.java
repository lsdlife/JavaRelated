package com.net_application.tcp.d4;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 目标：使用线程池优化实现通信的服务端
 */

public class ServerDemo1 {
    //1.定义一个线程池,使用静态变量
    private static ExecutorService pool=new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            System.out.println("服务端启动成功");
            //1.注册端口
            ServerSocket serverSocket=new ServerSocket(4444);

            //a.定义一个死循环的主线程负责不断地接收客户端的Socket的管道连接
            while (true) {
                //2.每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取
                Socket socket=serverSocket.accept();
                //追踪谁上线了
                System.out.println(socket.getRemoteSocketAddress() + "上线了");

                //封装成任务对象
                Runnable target=new ServerReaderRunnable(socket);
                //线程池执行任务
                pool.execute(target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
