/*
 * 文件名：Price.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：价格类
 * 修改人：Wang Chinda
 * 修改时间：2018/8/21
 * 修改内容：新增
 */
package com.itdoc.strategy.example01;

/**
 * 价格类
 *
 * @author Wang Chinda
 * @date 2018/8/21
 * @see
 * @since 1.0
 */
public class Price {
    
    /** 持有一个具体的策略对象 */
    private MemberStrategy strategy;

    /**
     * 构造函数，传入一个具体的策略对象
     * @param strategy    具体的策略对象
     */
    public Price(MemberStrategy strategy){
        this.strategy = strategy;
    }

    /**
     * 计算图书的价格
     * @param booksPrice    图书的原价
     * @return              计算出打折后的价格
     */
    public double quote(double booksPrice){
        return this.strategy.calcPrice(booksPrice);
    }
    
}
