package com.ggssh.pojo;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/1/31 0031 13:37
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
