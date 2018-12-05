package cn.colg.learn._01;

import cn.colg.util.IniUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        DbOperation dbOperation = (DbOperation)IniUtil.getBean("learn._01");
        String result = dbOperation.select("colg");
        log.info("result : {}", result);
    }
}
