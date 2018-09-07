/*
 * 文件名：IDCardFactory.java
 *
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/8/22
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wang Chinda
 * @date 2018/8/22
 * @see
 * @since 1.0
 */
public class IDCardFactory extends Factory {

    private List ownerList = new ArrayList();

    @Override
    protected void registerProduct(Product p) {
        ownerList.add(((IDCard) p).getOwner());
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    public List getOwnerList() {
        return ownerList;
    }
}
