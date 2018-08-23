package com.itdoc.factroy.base.example04;

/**
 * @DESC 抽象工厂
 * @BLOG http://www.cnblogs.com/goodcheap
 * @AUTHOR WángChéngDá
 * @CREATE 2017-09-17 10:51
 */
public abstract class AbHumanFactory implements HumanFactory {
    /** 给定一个性别人种, 创建一个人类出来  专业数据是产生产品等级 */
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;

        if (!"".equals(humanEnum.getValue())) {
            try {
                /** 直接生产一个实例 */
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
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
        return human;
    }
}
