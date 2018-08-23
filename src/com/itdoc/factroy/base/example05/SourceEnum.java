package com.itdoc.factroy.base.example05;

/**
 * @filename: SourceEnum.java
 * @desc ${DESCRIPTION}
 * @author: ${AUTHOR}
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-23 0:29
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180823   ${AUTHOR}   create
 * 20180823   ${AUTHOR}   modify   method()
 */
public enum SourceEnum {

    MysqlSource("com.itdoc.factroy.base.example05.MysqlSource"),
    OracleSource("com.itdoc.factroy.base.example05.OracleSource");

    private String value;

    SourceEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
