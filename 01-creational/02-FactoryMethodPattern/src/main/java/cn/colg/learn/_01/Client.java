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
        AbstractImageFactory factory;
        factory = (AbstractImageFactory)IniUtil.getBean("learn._01");
        factory.readExtName();
        log.info("----------------------------------------------------------------------------------------------------");
        factory.readExtName("args");
    }
}
