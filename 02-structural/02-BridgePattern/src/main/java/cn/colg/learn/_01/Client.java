package cn.colg.learn._01;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile file = (AbstractFile)IniUtil.getBean("learn._01_RefinedAbstraction");
        Db db = (Db)IniUtil.getBean("learn._01_ConcreteImplementor");
        file.setDb(db);
        file.parseData(new Data().setSchema("桥接模式"));
    }
}
