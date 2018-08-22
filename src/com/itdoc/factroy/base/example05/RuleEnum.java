package com.itdoc.factroy.base.example05;

/**
 * @filename: RuleEnum.java
 * @desc ${DESCRIPTION}
 * @author: ${AUTHOR}
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-23 0:19
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180823   ${AUTHOR}   create
 * 20180823   ${AUTHOR}   modify   method()
 */
public enum RuleEnum {

    ColumnRule("com.itdoc.factroy.base.example05.ColumnRule"),
    RegularRule("com.itdoc.factroy.base.example05.RegularRule");

    private String value;

    RuleEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
