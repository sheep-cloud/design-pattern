package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配器类 - 数据库操作
 *
 * @author colg
 */
@Slf4j
public class DbOperation01Adapter implements DbOperation {

    @Override
    public void add(String data) {}

    @Override
    public String select(String data) {
        // 调用适配者类Crypoto加密方法md5
        log.info("md5 算法加密");
        return new Crypoto().md5(data);
    }
}
