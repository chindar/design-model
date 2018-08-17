/*
 * 文件名：MoneyMarketAccount.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：货币市场账户
 * 修改人：Wang Chinda
 * 修改时间：2018/8/9
 * 修改内容：新增
 */
package com.itdoc.template.example02;

import com.itdoc.common.CommonConstant;

/**
 * 货币市场账户
 *
 * @author Wang Chinda
 * @date 2018/8/9
 * @see
 * @since 1.0
 */
public class MoneyMarketAccount extends BaseAccount {

    /**
     * 计算利率, 留给子类实现
     *
     * @return
     */
    @Override
    protected double doCalculateInterestRate() {
        return 0.45;
    }

    /**
     * 账目分类标记, 留给子类实现
     *
     * @return
     */
    @Override
    protected String doCalculateAccountType() {
        return CommonConstant.MONEY_MARKET_ACCOUNT_TYPE;
    }
}
