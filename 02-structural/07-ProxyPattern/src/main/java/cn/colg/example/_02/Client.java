package cn.colg.example._02;

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
        // 面向接口编程，客户端无须分辨真实主题类和代理类
        Searcher searcher = (Searcher)IniUtil.getBean("example._02");
        String result = searcher.doSearch("admin", "管理员");
        log.info("result : {}", result);
    }
}
