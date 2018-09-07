/*
 * 文件名：Client.java
 *
 * 描述：
 * 修改人：Wang Chinda
 * 修改时间：2018/8/9
 * 修改内容：新增
 */
package com.itdoc.template.example02;

/**
 * @author Wang Chinda
 * @date 2018/8/9
 * @see
 * @since 1.0
 */
public class Client {

    public static void main(String[] args) {
        BaseAccount account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());

        account = new CertificateDeposAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }
}
