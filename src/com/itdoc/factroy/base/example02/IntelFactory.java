/*
 * 文件名：MainboardFactory.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/8/17
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example02;

/**
 * @author Wang Chinda
 * @date 2018/8/17
 * @see
 * @since 1.0
 */
public class IntelFactory implements BaseFactory {

    /**
     * 创建CPU
     * @return
     */
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    /**
     * 创建主板
     * @return
     */
    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
