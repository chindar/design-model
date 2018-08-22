/**
 * @filename: NvWa.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-22 22:38
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
 * @create 2018-08-22 22:38
 */
public class NvWa {
    public static void main(String[] args) {
        /** 女娲第一次造人, 试验性质的, 少弄点。 */
        System.out.println("------------------白人-----------------");
        Human human = HumanFactory.createHuman(WhiteHuman.class);
        human.cry();
        human.laugh();
        human.talk();

        System.out.println("------------------黄人------------------");
        human = HumanFactory.createHuman(YellowHuman.class);
        human.cry();
        human.laugh();
        human.talk();

        System.out.println("-------------------黑人-------------------");
        human = HumanFactory.createHuman(BlackHuman.class);
        human.cry();
        human.laugh();
        human.talk();

        System.out.println();
        /** 女娲烦躁了, 爱啥人种就啥人种吧。 */
        for (int i = 0; i < 10000; i++) {
            human = HumanFactory.createHuman();
            human.cry();
            human.laugh();
            human.talk();
            System.out.println("-----------------------------------------");
        }
    }
}
