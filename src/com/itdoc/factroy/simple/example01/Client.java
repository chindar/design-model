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
package com.itdoc.factroy.simple.example01;

/**
 * @author Wang Chinda
 * @desc
 * @create 2018-08-18 9:58
 */
public class Client {


    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();

        // 若下面这么传值,　CPU和主板不会匹配, 这就是没有维护配件之间的关系造成的。
        engineer.makeComputer(1, 2);
    }
}
