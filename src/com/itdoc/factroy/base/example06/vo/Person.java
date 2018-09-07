/*
 * 文件名：Person.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/9/6
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example06.vo;

/**
 * @author Wang Chinda
 * @date 2018/9/6
 * @see
 * @since 1.0
 */
public class Person {

    private String name;

    private int age;

    private char sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
