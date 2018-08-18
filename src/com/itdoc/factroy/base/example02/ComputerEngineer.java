/*
 * 文件名：ComputerEngineer.java
 * 版权：Copyright Neusoft Corporation Rights Reserved.
 * 描述：装机工程师
 * 修改人：Wang Chinda
 * 修改时间：2018/8/17
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example02;

/**
 * 装机工程师
 *
 * @author Wang Chinda
 * @date 2018/8/17
 * @see
 * @since 1.0
 */
public class ComputerEngineer {

    /** 定义组装机需要的CPU */
    private Cpu cpu = null;

    /** 定义组装机需要的主板 */
    private Mainboard mainboard = null;


    public void makeComputer(BaseFactory bf){
        /**
         * 组装机器的基本步骤
         */
        //1:首先准备好装机所需要的配件
        prepareHardwares(bf);
        //2:组装机器
        //3:测试机器
        //4：交付客户
    }
    private void prepareHardwares(BaseFactory bf){
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        //可是，装机工程师并不知道如何去创建，怎么办呢？

        //直接找相应的工厂获取
        this.cpu = bf.createCpu();
        this.mainboard = bf.createMainboard();

        //测试配件是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
