/*
 * 文件名：IDCard.java
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
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }

    public String getOwner() {
        return owner;
    }
}
