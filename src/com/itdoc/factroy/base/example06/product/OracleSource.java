/*
 * 文件名：OracleSource.java
 *
 * 描述：Oracle数据源
 * 修改人：Wang Chinda
 * 修改时间：2018/9/6
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example06.product;


import com.itdoc.factroy.base.example06.vo.Person;

import java.sql.Connection;

/**
 * Oracle数据源
 *
 * @author Wang Chinda
 * @date 2018/9/6
 * @see
 * @since 1.0
 */
public class OracleSource implements DataSource {

    private Person person;

    @Override
    public void connect() {
        person = new Person();
        person.setName("李四");
        person.setAge(14);
        person.setSex('女');
        System.out.println("我是Oracle数据源连接");
    }

    @Override
    public void regular() {
        System.out.println(person);
        System.out.println("OracleSource我是正则扫描");
    }

    @Override
    public void exa() {
        System.out.println(person);
        System.out.println("OracleSource我是精确扫描");
    }

    @Override
    public void custom() {
        System.out.println(person);
        System.out.println("OracleSource我是自定义");
    }

    @Override
    public void comment() {
        System.out.println(person);
        System.out.println("OracleSource我是注释");
    }

    @Override
    public void vague() {
        System.out.println(person);
        System.out.println("OracleSource我是模糊");
    }
}
