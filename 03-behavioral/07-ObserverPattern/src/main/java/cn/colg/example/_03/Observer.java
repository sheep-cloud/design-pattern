package cn.colg.example._03;

/**
 * 抽象观察者
 *
 * @author colg
 */
public interface Observer {

    /**
     * 获取名称
     *
     * @return
     * @author colg
     */
    String getName();

    /**
     * 设置名称
     *
     * @param name
     * @author colg
     */
    void setName(String name);

    /**
     * 声明支援盟友方法
     *
     * @author colg
     */
    void help();

    /**
     * 声明遭受攻击方法
     *
     * @param allyControlCenter
     * @author colg
     */
    void beAttacked(AbstractAllyControlCenter allyControlCenter);
}
