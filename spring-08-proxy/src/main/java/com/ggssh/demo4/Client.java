package com.ggssh.demo4;

import com.ggssh.demo2.UserService;
import com.ggssh.demo2.UserServiceImpl;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/3 0003 20:42
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl service = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        //设置要代理的对象
        handler.setTarget(service);
        //动态生成代理类
        UserService proxy = (UserService) handler.getProxy();

        proxy.add();
    }
}
