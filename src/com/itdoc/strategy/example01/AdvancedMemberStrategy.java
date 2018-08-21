/*
 * 文件名：AdvancedMemberStrategy.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：高级会员折扣类
 * 修改人：Wang Chinda
 * 修改时间：2018/8/21
 * 修改内容：新增
 */
package com.itdoc.strategy.example01;

/**
 * 高级会员折扣类
 *
 * @author Wang Chinda
 * @date 2018/8/21
 * @see
 * @since 1.0
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    /**
     * 计算图书的价格
     *
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
