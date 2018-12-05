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
        // 根据配置参数获取界面显示模式
        AbstractVideoBuilder builder = (AbstractVideoBuilder)IniUtil.getBean("learn._01");
        Video video = builder.construct();
        log.info("video : {}", video);
    }
}
