package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        IoDHSingleton singleton1, singleton2;
        singleton1 = IoDHSingleton.getInstance();
        singleton2 = IoDHSingleton.getInstance();
        log.info("单例 : {}", singleton1 == singleton2);
    }
}
