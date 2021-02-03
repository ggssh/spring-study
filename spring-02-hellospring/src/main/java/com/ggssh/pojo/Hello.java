package com.ggssh.pojo;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/1/31 0031 11:01
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
