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
        // 针对抽象外观编程
        AbstractComputerFacade facade = (AbstractComputerFacade)IniUtil.getBean("learn._01");
        facade.start();
        log.info("----------------------------------------------------------------------------------------------------");
        facade.shutDown();
    }
}
