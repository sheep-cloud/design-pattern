package cn.colg.example._04;

/**
 * 抽象状态类
 *
 * @author colg
 */
public interface State {

    /**
     * 打开
     *
     * @param s
     * @author colg
     */
    void on(Switch s);

    /**
     * 关闭
     *
     * @param s
     * @author colg
     */
    void off(Switch s);
}
