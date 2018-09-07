/*
 * 文件名：Main.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/9/6
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example06;

import com.itdoc.factroy.base.example06.factory.DataSourceFactory;
import com.itdoc.factroy.base.example06.product.DataSource;

/**
 * @author Wang Chinda
 * @date 2018/9/6
 * @see
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        DataSourceFactory dataSourceFactory = new DataSourceFactory();

        DataSource dataSource = dataSourceFactory.createFile();
        dataSource.connect();

        dataSource.comment();
        dataSource.custom();
        dataSource.exa();
        dataSource.regular();
        dataSource.vague();


        System.out.println("-------------------------");
        dataSource = dataSourceFactory.createOracle();
        dataSource.connect();
        dataSource.comment();
        dataSource.custom();
        dataSource.exa();
        dataSource.regular();
        dataSource.vague();

        new Thread(() -> {
            DataSource dataSource1 = dataSourceFactory.createFile();
            dataSource1.connect();
            dataSource1.comment();
            dataSource1.custom();
            dataSource1.exa();
            dataSource1.regular();
            dataSource1.vague();
            System.out.println(Thread.currentThread().getName());
        }).run();


        System.out.println("-------------1------------");
        new Thread(() -> {
            DataSource dataSource1 = dataSourceFactory.createOracle();
            dataSource1.connect();
            dataSource1.comment();
            dataSource1.custom();
            dataSource1.exa();
            dataSource1.regular();
            dataSource1.vague();
            System.out.println(Thread.currentThread().getName());
        }).run();

        System.out.println("------------2-------------");
        new Thread(() -> {
            DataSource dataSource1 = dataSourceFactory.createFile();
            dataSource1.connect();
            dataSource1.comment();
            dataSource1.custom();
            dataSource1.exa();
            dataSource1.regular();
            dataSource1.vague();
            System.out.println(Thread.currentThread().getName());
        }).run();
    }
}
