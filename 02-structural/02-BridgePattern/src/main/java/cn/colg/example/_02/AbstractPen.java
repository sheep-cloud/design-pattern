package cn.colg.example._02;

import lombok.Setter;

/**
 * 抽象类 - 笔
 *
 * @author colg
 */
@Setter
public abstract class AbstractPen {

    /** 定义实现类接口对象，维护该对象 */
    protected Color color;

    /**
     * 绘图
     *
     * @author colg
     */
    public abstract void draw();
}
