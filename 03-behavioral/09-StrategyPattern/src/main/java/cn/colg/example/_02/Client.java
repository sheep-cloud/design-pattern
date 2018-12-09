package cn.colg.example._02;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        // 在运行时执行类型
        Strategy strategy = (Strategy)IniUtil.getBean("example._02");
        context.setStrategy(strategy);
        context.algorithm();
    }
}
