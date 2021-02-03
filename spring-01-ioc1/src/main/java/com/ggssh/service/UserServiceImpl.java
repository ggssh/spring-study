package com.ggssh.service;

import com.ggssh.dao.UserDao;
import com.ggssh.dao.UserDaoImpl;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/1/30 0030 22:41
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
