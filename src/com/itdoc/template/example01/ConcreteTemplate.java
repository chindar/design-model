/*
 * 文件名：ConcreteTemplate.java
 *
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/8/9
 * 修改内容：新增
 */
package com.itdoc.template.example01;

/**
 * @author Wang Chinda
 * @date 2018/8/9
 * @see
 * @since 1.0
 */
public class ConcreteTemplate extends BaseTemplate {

    /**
     * 基本方法的声明（由子类实现）
     */
    @Override
    protected void abstractMethod() {
        //业务相关的代码
    }

    /**
     * 基本方法(空方法)
     */
    @Override
    protected void hookMethod() {
        //业务相关的代码
    }
}
