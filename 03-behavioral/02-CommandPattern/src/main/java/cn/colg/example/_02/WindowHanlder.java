package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 接收者 - 窗口处理类
 *
 * @author colg
 */
@Slf4j
public class WindowHanlder {

    public void minimize() {
        log.info("将窗口最小化至托盘！");
    }
}
