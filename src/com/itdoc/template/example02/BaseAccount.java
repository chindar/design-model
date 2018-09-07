/*
 * 文件名：Account.java
 *
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/8/9
 * 修改内容：新增
 */
package com.itdoc.template.example02;

import com.itdoc.common.CommonConstant;

/**
 * @author Wang Chinda
 * @date 2018/8/9
 * @see
 * @since 1.0
 */
public abstract class BaseAccount {

    /**
     * 模板方法，计算利息数额
     *
     * @return 返回利息数额
     */
    public double calculateInterest() {

        // 计算利率
        double interestRate = doCalculateInterestRate();

        // 账目分类标记
        String accountType = doCalculateAccountType();

        // 计算量
        double amount = calculateAmount(accountType);

        return amount * interestRate;
    }

    /**
     * 计算利率, 留给子类实现
     *
     * @return
     */
    protected abstract double doCalculateInterestRate();

    /**
     * 账目分类标记, 留给子类实现
     *
     * @return
     */
    protected abstract String doCalculateAccountType();

    /**
     * 计算量
     *
     * @param accountType
     * @return
     */
    private double calculateAmount(String accountType) {
        int interest = 0;

        if (CommonConstant.MONEY_MARKET_ACCOUNT_TYPE.equals(accountType)) {
            // 具体业务逻辑
            interest = 900000;
        }

        if (CommonConstant.CERTIFICATE_OF_DEPOSITE_ACCOUNT_TYPE.equals(accountType)) {
            // 具体业务逻辑
            interest = 1000000;
        }

        return interest;
    }
}
