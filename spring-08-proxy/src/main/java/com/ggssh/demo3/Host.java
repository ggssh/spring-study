package com.ggssh.demo3;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/3 0003 20:23
 */
//房东
public class Host implements Rent{
    @Override
    public void rent(){
        System.out.println("出租房子");
    }
}

