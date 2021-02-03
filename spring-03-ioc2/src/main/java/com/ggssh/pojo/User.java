package com.ggssh.pojo;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/1/31 0031 11:32
 */
public class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name = " + name);
    }
}
