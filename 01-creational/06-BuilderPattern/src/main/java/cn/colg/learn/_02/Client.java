package cn.colg.learn._02;

import cn.colg.util.IniUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Builder<Video> builder = (Builder<Video>)IniUtil.getBean("learn._02");
        Video video = builder.build();
        log.info("video : {}", video);
    }
}
