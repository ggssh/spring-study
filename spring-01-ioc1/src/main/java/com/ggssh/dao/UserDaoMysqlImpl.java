package com.ggssh.dao;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/1/30 0030 22:45
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}
