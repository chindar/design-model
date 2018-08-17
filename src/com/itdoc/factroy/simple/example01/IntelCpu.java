/*
 * 文件名：IntelCpu.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/8/17
 * 修改内容：新增
 */
package com.itdoc.factroy.simple.example01;

/**
 * @author Wang Chinda
 * @date 2018/8/17
 * @see
 * @since 1.0
 */
public class IntelCpu implements Cpu {

    /** CPU针脚数 */
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
