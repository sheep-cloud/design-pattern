package cn.colg.example._02;

/**
 * 抽象构件
 * 
 * <pre>
 * 它可以是接口或抽象类，为叶子构件和容器构件对象声明接口，在该角色中可以包含所有子类共有行为的声明和实现。
 * 在抽象构件中定义了访问及管理它的子构件的方法，如增加子构件、删除子构件、获取子构件等。
 * </pre>
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
     * 抽象业务方法
     *
     * @author colg
     */
    void operation();
}
