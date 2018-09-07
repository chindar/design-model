/*
 * 文件名：CertificateDeposAccount.java
 *
 * 描述：定期存款账户
 * 修改人：Wang Chinda
 * 修改时间：2018/8/9
 * 修改内容：新增
 */
package com.itdoc.template.example02;

import com.itdoc.common.CommonConstant;

/**
 * 定期存款账户
 *
 * @author Wang Chinda
 * @date 2018/8/9
 * @see
 * @since 1.0
 */
public class CertificateDeposAccount extends BaseAccount {

    /**
     * 计算利率, 留给子类实现
     *
     * @return
     */
    @Override
    protected double doCalculateInterestRate() {
        return 0.3;
    }

    /**
     * 账目分类标记, 留给子类实现
     *
     * @return
     */
    @Override
    protected String doCalculateAccountType() {
        return CommonConstant.CERTIFICATE_OF_DEPOSITE_ACCOUNT_TYPE;
    }
}
