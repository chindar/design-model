/*
 * 文件名：IntelMainboard.java
 *
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
public class IntelMainboard implements Mainboard {

    /** CPU插孔数 */
    private int cpuHoles = 0;

    public IntelMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
    }
}
