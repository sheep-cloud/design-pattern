package cn.colg.example._04;

import cn.colg.example._04.factory.SkinFactory;
import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory factory;
        factory = (SkinFactory)IniUtil.getBean("example._04");
        factory.createButton().display();
        factory.createText().display();
        factory.createSelect().display();
    }
}
