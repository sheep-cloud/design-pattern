package cn.colg.example._03;

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
        // example._02=cn.colg.example._03.DevilBuilder
        AbstractActorBuilder builder = (AbstractActorBuilder)IniUtil.getBean("example._03");
        Actor actor = builder.construct();
        log.info("actor : {}", actor);
    }
}
