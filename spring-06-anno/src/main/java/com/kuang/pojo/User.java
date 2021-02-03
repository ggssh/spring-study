package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/2 0002 15:22
 */
//组件
@Component
public class User {
    @Value("小明1")
    public String name;
}
