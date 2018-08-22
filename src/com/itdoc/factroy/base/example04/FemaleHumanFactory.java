package com.itdoc.factroy.base.example04;

/**
 * @DESC 女性创建工厂
 * @BLOG http://www.cnblogs.com/goodcheap
 * @AUTHOR WángChéngDá
 * @CREATE 2017-09-17 11:06
 */
public class FemaleHumanFactory extends AbHumanFactory {
    /** 创建一个女性黄种人 */
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }

    /** 创建一个女性白种人 */
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    /** 创建一个女性黑种人 */
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
