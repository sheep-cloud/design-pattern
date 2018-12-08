package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        // 受用抽象构件类型定义
        AbstractComponent dis, reverse, md5;
        // 定义具体构件
        dis = new Displacement();
        String data = "abcdefg";
        log.info("一次加密（位移） : {}", dis.crypoto(data));
        log.info("----------------------------------------------------------------------------------------------------");

        // 二次加密
        reverse = new Reverse(dis);
        log.info("二次加密（逆向） : {}", reverse.crypoto(data));
        log.info("----------------------------------------------------------------------------------------------------");

        // 三次加密
        md5 = new Md5(reverse);
        log.info("三次加密（md5） : {}", md5.crypoto(data));
        log.info("----------------------------------------------------------------------------------------------------");

        // 四次加密
        AbstractComponent sha1 = new Sha1(md5);
        log.info("四次加密（sha1） : {}", sha1.crypoto(data));
    }
}
