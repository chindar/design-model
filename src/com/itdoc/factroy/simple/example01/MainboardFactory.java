/*
 * 文件名：MainboardFactory.java
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
public class MainboardFactory {

    public static Mainboard createMainboard(int type){
        Mainboard mainboard = null;
        if(type == 1){
            mainboard = new IntelMainboard(755);
        }else if(type == 2){
            mainboard = new AmdMainboard(938);
        }
        return mainboard;
    }
}
