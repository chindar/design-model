/**
 * @filename: YellowHuman.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-22 22:41
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180822   Wang Chinda   create
 * 20180822   Wang Chinda   modify   method()
 */
package com.itdoc.factroy.base.example03;

/**
 * @desc
 * @author Wang Chinda
 * @create 2018-08-22 22:41
 */
public class YellowHuman implements Human {
    @Override
    public void cry() {
        System.out.println("黄种人会哭。");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话, 说汉语。");
    }

    @Override
    public void laugh() {
        System.out.println("黄种人会大笑, 幸福的笑。");
    }
}
