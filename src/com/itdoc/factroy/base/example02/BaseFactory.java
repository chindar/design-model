/**
 * @filename: BaseFactory.java
 * @desc 抽象工厂
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-18 10:14
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180818   Wang Chinda   create
 * 20180818   Wang Chinda   modify   method()
 */
package com.itdoc.factroy.base.example02;

/**
 * @author Wang Chinda
 * @desc 抽象工厂
 * @create 2018-08-18 10:14
 */
public interface BaseFactory {

    /**
     * 创建CPU对象
     *
     * @return CPU对象
     */
    public Cpu createCpu();

    /**
     * 创建主板对象
     *
     * @return 主板对象
     */
    public Mainboard createMainboard();
}
