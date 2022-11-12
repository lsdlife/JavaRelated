package com.net_application.multicast;

import java.net.*;

/**
 * 组播
 */

public class ServerDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("。。。。。。。。服务端启动了。。。。。。。。");
        //1.创建服务器对象
        MulticastSocket server = new MulticastSocket(9999);

        //把当前接受端加入到一个组播组中:绑定对那个的组播消息的组播IP
        //server.joinGroup(InetAddress.getByName("224.0.1.1"));     jdk14开始不用了
        server.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.1.1"),
                9999), NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));

        //2.创建一个数据包对象（韭菜盘子）接收数据
        byte buffer[] = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        //3.等到接收数据即可
        while (true) {
            server.receive(packet);
            //4.取出数据
            int length = packet.getLength();
            String rs = new String(buffer, 0, length);
            System.out.println("收到了来自 " + packet.getAddress() +
                    " 对方端口号：" + packet.getPort() + " 的消息： " + rs);

            //获取发送端的端口和ip
//            String senderip = packet.getSocketAddress().toString();
//            System.out.println("对方ip:" + senderip);
//            int senderport = packet.getPort();
//            System.out.println("对方端口:" + senderport);
        }
        //关闭管道
        //server.close();
    }
}
