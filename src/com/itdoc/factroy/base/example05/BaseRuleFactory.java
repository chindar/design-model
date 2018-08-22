/**
 * @filename: BaseRuleFactory.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-23 0:16
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180823   Wang Chinda   create
 * 20180823   Wang Chinda   modify   method()
 */
package com.itdoc.factroy.base.example05;

/**
 * @desc
 * @author Wang Chinda
 * @create 2018-08-23 0:16
 */
public abstract class BaseRuleFactory {

    public abstract Rule createRegularRule();

    public abstract Rule createColumnRule();

    public Rule createRule(RuleEnum ruleEnum) {
        Rule rule = null;

        if (!"".equals(ruleEnum.getValue())) {
            try {
                /** 直接生产一个实例 */
                rule = (Rule) Class.forName(ruleEnum.getValue()).newInstance();
            }
            /** 因为用了 Enum, 这种异常情况就不会产生了, 除非你的 Enum 有问题。 */
            catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return rule;
    }
}
