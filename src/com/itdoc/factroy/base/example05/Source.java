/**
 * @filename: Source.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-22 23:50
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180822   Wang Chinda   create
 * 20180822   Wang Chinda   modify   method()
 */
package com.itdoc.factroy.base.example05;

import javax.sql.DataSource;

/**
 * @desc
 * @author Wang Chinda
 * @create 2018-08-22 23:50
 */
public interface Source {

    public void connect(DataSource dataSource);
}
