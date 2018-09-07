/*
 * 文件名：FileSource.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：文件数据源
 * 修改人：Wang Chinda
 * 修改时间：2018/9/6
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example06.product;

import com.itdoc.factroy.base.example06.vo.Person;
import sun.net.ftp.impl.FtpClient;

/**
 * 文件数据源
 *
 * @author Wang Chinda
 * @date 2018/9/6
 * @see
 * @since 1.0
 */
public class FileSource implements DataSource {

    private Person person;

    @Override
    public void connect() {
        person = new Person();

        person.setName("张三");
        person.setAge(18);
        person.setSex('男');
        System.out.println("我是文件数据源连接");

    }

    @Override
    public void regular() {
        System.out.println(person);
        System.out.println("FileSource我是正则扫描");
    }

    @Override
    public void exa() {
        System.out.println(person);
        System.out.println("FileSource我是精确扫描");
    }

    @Override
    public void custom() {
        System.out.println(person);
        System.out.println("FileSource我是自定义");
    }

    @Override
    public void comment() {
        System.out.println(person);
        System.out.println("FileSource我是注释");
    }

    @Override
    public void vague() {
        System.out.println(person);
        System.out.println("FileSource我是模糊");
    }
}
