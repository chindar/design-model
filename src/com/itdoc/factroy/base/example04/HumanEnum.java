package com.itdoc.factroy.base.example04;

/**
 * @BLOG http://www.cnblogs.com/goodcheap
 * @AUTHOR WángChéngDá
 * @CREATE 2017-09-10 15:38
 */
public enum HumanEnum {

    YelloFemaleHuman("com.itdoc.factroy.base.example04.YellowFemaleHuman"),
    YelloMaleHuman("com.itdoc.factroy.base.example04.YellowMaleHuman"),
    WhiteFemaleHuman("com.itdoc.factroy.base.example04.WhiteFemaleHuman"),
    WhiteMaleHuman("com.itdoc.factroy.base.example04.WhiteMaleHuman"),
    BlackFemaleHuman("com.itdoc.factroy.base.example04.BlackFemaleHuman"),
    BlackMaleHuman("com.itdoc.factroy.base.example04.BlackMaleHuman");

    private String value;

    HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
