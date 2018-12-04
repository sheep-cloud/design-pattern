package cn.colg.example._02;

/**
 * 抽象产品角色
 *
 * @author colg
 */
public abstract class Product {

    /**
     * 所有产品类的公共业务方法
     *
     * @author colg
     */
    public void methodSame() {
        // 公共方法的实现
    }

    /**
     * 声明抽象业务方法
     *
     * @author colg
     */
    public abstract void methodDiff();
}
