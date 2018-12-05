package cn.colg.learn._02;

/**
 * 抽象建造者
 *
 * @author colg
 * @param <T> 建造对象类型
 */
public interface Builder<T> {

    /**
     * 构建对象
     *
     * @return 被构建的对象
     * @author colg
     */
    T build();
}
