package cn.colg.learn._01;

/**
 * 目标接口 - 数据库操作
 *
 * @author colg
 */
public interface DbOperation {

    /**
     * 添加数据
     *
     * @param data
     * @author colg
     */
    void add(String data);

    /**
     * 查询数据
     *
     * @param data
     * @return
     * @author colg
     */
    String select(String data);
}
