/*
 * 文件名：Main.java
 *
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/8/22
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example01;

/**
 * @author Wang Chinda
 * @date 2018/8/22
 * @see
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小红");
        Product card2 = factory.create("小明");
        Product card3 = factory.create("小刚");

        card1.use();
        card2.use();
        card3.use();
    }
}
