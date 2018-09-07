/*
 * 文件名：DataSource.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：数据源
 * 修改人：Wang Chinda
 * 修改时间：2018/9/6
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example06.product;

/**
 * 数据源
 *
 * @author Wang Chinda
 * @date 2018/9/6
 * @see
 * @since 1.0
 */
public interface DataSource {

    public void connect();

    public void regular();

    public void exa();

    public void custom();

    public void comment();

    public void vague();


}
