package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现类 - MySQL数据库
 *
 * @author colg
 */
@Slf4j
public class MySqlDb implements Db {

    @Override
    public void convert(Data data) {
        log.info("MySql数据库数据转换 : {}", data.setDbType("MySql"));
    }
}
