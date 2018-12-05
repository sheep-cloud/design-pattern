package cn.colg.example._02;

/**
 * 抽象构件
 *
 * @author colg
 */
public interface Component {

    /**
     * 添加成员
     *
     * @param c
     * @return
     * @author colg
     */
    Component add(Component c);

    /**
     * 删除成员
     *
     * @param c
     * @return
     * @author colg
     */
    Component remove(Component c);

    /**
     * 获取成员
     *
     * @param i
     * @return
     * @author colg
     */
    Component getChild(int i);

    /**
     * 业务方法
     *
     * @author colg
     */
    void operation();

}
