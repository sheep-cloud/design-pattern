package cn.colg.learn._02;

/**
 * 缺省适配器
 *
 * @author colg
 */
public abstract class AbstractServiceAdapter implements Service {

    @Override
    public void add(String data) {}

    @Override
    public void delete(String data) {}

    @Override
    public void select(String data) {}

}
