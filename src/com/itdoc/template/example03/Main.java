/*
 * 文件名：Main.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/8/22
 * 修改内容：新增
 */
package com.itdoc.template.example03;

/**
 * @author Wang Chinda
 * @date 2018/8/22
 * @see
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        BaseDisplay d1 = new CharDisplay('H');
        BaseDisplay d2 = new StringDisplay("Hello world!");
        BaseDisplay d3 = new StringDisplay("你好，世界。");

        d1.display();
        d2.display();
        d3.display();
    }
}
