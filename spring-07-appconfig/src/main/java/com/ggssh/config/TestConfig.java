package com.ggssh.config;

import com.ggssh.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/3 0003 11:25
 */
//这个也会被Spring容器托管，注册到容器中，因为它本身就是一个@Component
//@Configuration代表这是一个配置类，就和我们之前看的beans.xml
@Configuration
@ComponentScan("com.ggssh.pojo")
@Import(TestConfig2.class)
public class TestConfig {

    /*
    注册一个bean，就相当于我们之前写的一个Bean标签
    这个方法的名字相当于bean标签中的id属性
    这个方法的返回值相当于bean标签中的class属性
     */
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean的对象
    }
}
