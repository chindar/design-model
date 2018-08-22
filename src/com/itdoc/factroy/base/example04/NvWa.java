package com.itdoc.factroy.base.example04;

/**
 * @DESC 女娲， 创建两条生产线, 女性生产线, 男性生产线
 * @BLOG http://www.cnblogs.com/goodcheap
 * @AUTHOR WángChéngDá
 * @CREATE 2017-09-17 11:08
 */
public class NvWa {

    public static void main(String[] args) {
        /** 第一条生产线, 男性生产线 */
        HumanFactory maleHumanFactory = new MaleHumanFactory();

        /** 第二条生产线, 女性生产线 */
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        /** 生产线创建完成, 开始造人了 */
        /** 制造男性黄种人 */
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        maleYellowHuman.talk();
        maleYellowHuman.laugh();
        maleYellowHuman.cry();
        maleYellowHuman.sex();
        System.out.println("---------------------------------------------");
        /** 制造女性黄种人 */
        Human famaleYellowHuman = femaleHumanFactory.createYellowHuman();
        famaleYellowHuman.talk();
        famaleYellowHuman.laugh();
        famaleYellowHuman.cry();
        famaleYellowHuman.sex();

        System.out.println("---------------------------------------------");
        /** 制造男性白种人 */
        Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
        maleWhiteHuman.talk();
        maleWhiteHuman.laugh();
        maleWhiteHuman.cry();
        maleWhiteHuman.sex();
        System.out.println("---------------------------------------------");
        /** 制造女性白种人 */
        Human famaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
        famaleWhiteHuman.talk();
        famaleWhiteHuman.laugh();
        famaleWhiteHuman.cry();
        famaleWhiteHuman.sex();

        System.out.println("---------------------------------------------");
        /** 制造男性黑种人 */
        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        maleBlackHuman.talk();
        maleBlackHuman.laugh();
        maleBlackHuman.cry();
        maleBlackHuman.sex();
        System.out.println("---------------------------------------------");
        /** 制造女性黑种人 */
        Human famaleBlackHuman = femaleHumanFactory.createBlackHuman();
        famaleBlackHuman.talk();
        famaleBlackHuman.laugh();
        famaleBlackHuman.cry();
        famaleBlackHuman.sex();
    }
}
