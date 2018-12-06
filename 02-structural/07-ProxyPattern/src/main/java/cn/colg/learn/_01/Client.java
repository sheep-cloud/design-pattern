package cn.colg.learn._01;

import cn.colg.util.IniUtil;
import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        Math math = (Math)IniUtil.getBean("learn._01");
        math.div(10, 2);
        log.info("----------------------------------------------------------------------------------------------------");
        
        ThreadUtil.sleep(3000);
        math.div(10, 0);
    }
}
