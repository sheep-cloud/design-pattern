package cn.colg.learn._02;

/**
 * 适配者接口
 *
 * @author colg
 */
public interface Service {

    /**
     * 添加
     *
     * @param data
     * @author colg
     */
    void add(String data);

    /**
     * 删除
     *
     * @param data
     * @author colg
     */
    void delete(String data);

    /**
     * 查询
     *
     * @param data
     * @author colg
     */
    void select(String data);
}
