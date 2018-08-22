/**
 * @filename: HumanFactory.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-22 23:40
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180822   Wang Chinda   create
 * 20180822   Wang Chinda   modify   method()
 */
package com.itdoc.factroy.base.example04;

/**
 * @desc
 * @author Wang Chinda
 * @create 2018-08-22 23:40
 */
public interface HumanFactory {

    /** 制造黄种人 */
    public Human createYellowHuman();

    /** 制造白种人 */
    public Human createWhiteHuman();

    /** 制造黑种人 */
    public Human createBlackHuman();
}
