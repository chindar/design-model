/*
 * 文件名：Factory.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/8/22
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example01;

/**
 * @author Wang Chinda
 * @date 2018/8/22
 * @see
 * @since 1.0
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract void registerProduct(Product p);

    protected abstract Product createProduct(String owner);
}
