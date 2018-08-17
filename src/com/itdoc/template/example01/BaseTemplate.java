/*
 * 文件名：AbsTemplate.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/8/9
 * 修改内容：新增
 */
package com.itdoc.template.example01;

/**
 * 模板抽象类
 *
 * @author Wang Chinda
 * @date 2018/8/9
 * @see
 * @since 1.0
 */
public abstract class BaseTemplate {

    /**
     * 模板方法
     */
    public void templateMethod() {

        //调用基本方法
        abstractMethod();
        hookMethod();
        concreteMethod();
    }

    /**
     * 基本方法的声明（由子类实现）
     */
    protected abstract void abstractMethod();

    /**
     * 基本方法(空方法)
     */
    protected void hookMethod() {

    }

    /**
     * 基本方法（已经实现）
     */
    private final void concreteMethod() {
        //业务相关的代码
    }
}
