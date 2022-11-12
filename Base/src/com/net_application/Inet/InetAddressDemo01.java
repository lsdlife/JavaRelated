package com.net_application.Inet;

import java.net.InetAddress;

/**
 * InetAddress类概述
 */

public class InetAddressDemo01 {
    public static void main(String[] args) throws Exception {
        //1.获取本机地址对象
        InetAddress ip1=InetAddress.getLocalHost();
        System.out.println(ip1);
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //2.获取域名IP对象
        InetAddress ip2=InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        //3.获取公网ip对象
        InetAddress ip3=InetAddress.getByName("183.232.231.172");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        //4.判断是否能ping通， ping 5s之内测试是否可通
        System.out.println(ip3.isReachable(5000));
    }
}
