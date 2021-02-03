package com.ggssh.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/3 0003 11:24
 */
//这个注解说明这个类被spring接管注册到了容器中
@Component
public class User {

    @Value("ggssh")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
