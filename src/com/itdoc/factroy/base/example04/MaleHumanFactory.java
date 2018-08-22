package com.itdoc.factroy.base.example04;

/**
 * @DESC 男性创建工厂
 * @BLOG http://www.cnblogs.com/goodcheap
 * @AUTHOR WángChéngDá
 * @CREATE 2017-09-17 11:02
 */
public class MaleHumanFactory extends AbHumanFactory {

    /** 创建一个男性的黄种人 */
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

    /** 创建一个男性白种人 */
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    /** 创建一个男性黑种人 */
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
