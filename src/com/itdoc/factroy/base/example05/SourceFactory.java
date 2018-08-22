/**
 * @filename: SourceFactory.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-23 0:00
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180823   Wang Chinda   create
 * 20180823   Wang Chinda   modify   method()
 */
package com.itdoc.factroy.base.example05;

/**
 * @desc
 * @author Wang Chinda
 * @create 2018-08-23 0:00
 */
public class SourceFactory extends BaseSourceFactory {


    @Override
    public Source createMysqlSource() {
        return super.createSource(SourceEnum.MysqlSource);
    }

    @Override
    public Source createOracleSource() {
        return super.createSource(SourceEnum.OracleSource);
    }
}
