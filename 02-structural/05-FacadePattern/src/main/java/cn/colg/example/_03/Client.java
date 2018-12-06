package cn.colg.example._03;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        // 针对抽象外观编程
        AbstractEncryptFacade facade = (AbstractEncryptFacade)IniUtil.getBean("example._03");
        facade.fileEncrypt("src.txt", "des.txt");
    }
}
