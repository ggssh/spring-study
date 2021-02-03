package com.ggssh.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.DataOutput;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/1 0001 15:26
 */
public class Person {

    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
