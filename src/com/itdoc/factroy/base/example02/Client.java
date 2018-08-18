/**
 * @filename: Client.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-18 9:58
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180818   Wang Chinda   create
 * 20180818   Wang Chinda   modify   method()
 */
package com.itdoc.factroy.base.example02;

/**
 * @author Wang Chinda
 * @desc
 * @create 2018-08-18 9:58
 */
public class Client {


    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();

        // 直接传入产品工厂就可以了
        engineer.makeComputer(new AmdFactory());
    }
}
