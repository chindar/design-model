/**
 * @filename: HumanFactory.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-08-22 22:52
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180822   Wang Chinda   create
 * 20180822   Wang Chinda   modify   method()
 */
package com.itdoc.factroy.base.example03;

import com.itdoc.common.ClassUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author Wang Chinda
 * @desc
 * @create 2018-08-22 22:52
 */
public class HumanFactory {

    /**
     * 定义一个 Map, 初始化的 Human 全部放入 Map 中,
     * 需要 human 的时候从 Map 中取,
     * 若是 Map 中没有的话, 再初始化一个新的。
     */
    public static Map<String, Human> humans = new HashMap<>(16);

    /** 定义一个烤箱, 泥巴塞进去, 人就出来了。 */
    public static Human createHuman(Class c) {
        Human human = null;
        try {
//            /** 产生一个人种 */
//            human = (Human) Class.forName(c.getName()).newInstance();

            /** 延迟初始化 */
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(), human);
            }
        } catch (InstantiationException e) {
            /** 要是不指定人种颜色会报错。 */
            System.out.println("必须指定一个人种的颜色！");
        } catch (IllegalAccessException e) {
            /** 定义人种有问题, 就会出现异常。 */
            System.out.println("定义的人种有问题！");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋, 找不到你想要的人种。");
        }
        return human;
    }

    public static Human createHuman() {
        // 获取 Human 有多少实现类
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        int rand = new Random().nextInt(concreteHumanList.size());
        Human human = createHuman(concreteHumanList.get(rand));
        return human;
    }

}
