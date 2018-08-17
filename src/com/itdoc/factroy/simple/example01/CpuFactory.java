/*
 * 文件名：CpuFactory.java
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
public class CpuFactory {

    public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}
