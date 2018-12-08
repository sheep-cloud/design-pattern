package cn.colg.learn._01;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        DbOperation dbOperation = (DbOperation)IniUtil.getBean("learn._01");
        dbOperation.add("Colg");
    }
}
