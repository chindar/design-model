/*
 * 文件名：MemberStrategy.java
 *
 * 描述：抽象折扣类
 * 修改人：Wang Chinda
 * 修改时间：2018/8/21
 * 修改内容：新增
 */
package com.itdoc.strategy.example01;

/**
 * 抽象折扣类
 *
 * @author Wang Chinda
 * @date 2018/8/21
 * @see
 * @since 1.0
 */
public interface MemberStrategy {

    /**
     * 计算图书的价格
     * @param booksPrice    图书的原价
     * @return              计算出打折后的价格
     */
    public double calcPrice(double booksPrice);
}
