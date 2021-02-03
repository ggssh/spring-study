package com.ggssh.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/3 0003 20:24
 */
//使用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this );
    }

    @Override
    //处理代理示例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制实现
        seeHouse();
        Object invoke = method.invoke(rent, args);
        fare();
        return null;
    }

    public void seeHouse(){
        System.out.println("中介带看房子");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
