package com.ggssh.demo2;

import com.ggssh.demo3.Rent;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/3 0003 20:00
 */
public class UserServiceImpl implements UserService, Rent {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询到一个用户");
    }

    @Override
    public void rent() {

    }
}
