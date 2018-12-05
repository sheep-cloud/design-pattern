package cn.colg.learn._02;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        Service service = (Service)IniUtil.getBean("learn._02");
        service.add("result");
    }
}
