package com.ggssh.demo1;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/3 0003 12:04
 */
public class Proxy implements Rent{

    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    @Override
    public void rent() {
        host.rent();
        System.out.println("hhh");
    }
}
