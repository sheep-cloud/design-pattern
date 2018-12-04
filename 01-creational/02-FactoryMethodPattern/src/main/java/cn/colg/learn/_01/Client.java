package cn.colg.learn._01;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractImageFactory factory;
        factory = (AbstractImageFactory)IniUtil.getBean();
        factory.readExtName();
    }
}
