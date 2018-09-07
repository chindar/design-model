/*
 * 文件名：DataSourceFactory.java
 *
 * 描述：数据源工厂
 * 修改人：Wang Chinda
 * 修改时间：2018/9/6
 * 修改内容：新增
 */
package com.itdoc.factroy.base.example06.factory;

import com.itdoc.factroy.base.example06.product.DataSource;
import com.itdoc.factroy.base.example06.product.FileSource;
import com.itdoc.factroy.base.example06.product.OracleSource;

/**
 * 数据源工厂
 *
 * @author Wang Chinda
 * @date 2018/9/6
 * @see
 * @since 1.0
 */
public class DataSourceFactory {

    public DataSource createOracle() {
        return new OracleSource();
    }

    public DataSource createFile() {
        return new FileSource();
    }

}
