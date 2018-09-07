
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
