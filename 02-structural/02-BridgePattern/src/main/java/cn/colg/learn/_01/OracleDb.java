package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现类 - Oracle数据库
 *
 * @author colg
 */
@Slf4j
public class OracleDb implements Db {

    @Override
    public void convert(Data data) {
        log.info("Oracle数据库数据转换 : {}", data.setDbType("Oracle"));
    }
}
