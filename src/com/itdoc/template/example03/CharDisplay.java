/*
 * 文件名：CharDisplay.java
 *
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
public class CharDisplay extends BaseDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    public CharDisplay() {
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
