package com.itdoc.factroy.base.example03;

/**
 * @DESC 黑人
 * @BLOG http://www.cnblogs.com/goodcheap
 * @AUTHOR WángChéngDá
 * @CREATE 2017-09-10 6:25
 */
public class BlackHuman implements Human {
    @Override
    public void cry() {
        System.out.println("黑人会哭，很伤心的那种。");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话, 好多语种, 反正我听不懂。");
    }

    @Override
    public void laugh() {
        System.out.println("黑人会大笑, 给他们一堆火, 他们就很开心的大笑。");
    }
}
