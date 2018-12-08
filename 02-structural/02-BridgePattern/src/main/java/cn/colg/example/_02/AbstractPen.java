package cn.colg.example._02;

/**
 * 抽象类 - 笔
 *
 * @author colg
 */
public abstract class AbstractPen {

    /** 定义实现类接口对象，维护该对象；构造注入 */
    protected Color color;

    public AbstractPen(Color color) {
        this.color = color;
    }

    /**
     * 绘图
     *
     * @author colg
     */
    public abstract void draw();
}
