package cn.colg.example._03;

/**
 * 抽象状态类
 *
 * @author colg
 */
public abstract class AbstractAccountState {

    /** 维持一个环境类的引用；构造注入 */
    protected Account account;

    /**
     * 存款
     *
     * @param amount
     * @author colg
     */
    public abstract void deposit(double amount);

    /**
     * 取款
     *
     * @param amount
     * @author colg
     */
    public abstract void withdraw(double amount);

    /**
     * 计算利息
     *
     * @author colg
     */
    public abstract void computeInterest();

    /**
     * 状态检查和转换操作
     *
     * @author colg
     */
    public abstract void stateCheck();
}
