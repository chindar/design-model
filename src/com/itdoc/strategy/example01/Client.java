/*
 * 文件名：Client.java
 *
 * 描述：客户端
 * 修改人：Wang Chinda
 * 修改时间：2018/8/21
 * 修改内容：新增
 */
package com.itdoc.strategy.example01;

/**
 * 客户端
 *
 * @author Wang Chinda
 * @date 2018/8/21
 * @see
 * @since 1.0
 */
public class Client {

    public static void main(String[] args) {

        //选择并创建需要使用的策略对象
        MemberStrategy strategy = new AdvancedMemberStrategy();

        //创建环境
        Price price = new Price(strategy);

        //计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
