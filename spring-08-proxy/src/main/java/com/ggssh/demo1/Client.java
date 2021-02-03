package com.ggssh.demo1;

import java.util.Properties;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/3 0003 12:03
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //代理
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
