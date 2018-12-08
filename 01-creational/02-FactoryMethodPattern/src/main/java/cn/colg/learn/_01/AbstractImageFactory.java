package cn.colg.learn._01;

/**
 * 抽象工厂 - 图片工厂
 *
 * @author colg
 */
public abstract class AbstractImageFactory {

    /**
     * 使用默认方式读取扩展名
     *
     * @author colg
     */
    public void readExtName() {
        this.createImage().readExtName();
    }

    /**
     * 使用参数args方式读取扩展名
     *
     * @param args
     * @author colg
     */
    public void readExtName(String args) {
        this.createImage(args).readExtName();
    }

    /**
     * 使用对象obj封装的数据读取扩展名
     *
     * @param obj
     * @author colg
     */
    public void readExtName(Object obj) {
        this.createImage(obj).readExtName();
    }

    /**
     * 使用默认方式创建图片
     *
     * @return
     * @author colg
     */
    public abstract Image createImage();

    /**
     * 使用参数args创建图片
     *
     * @param args
     * @return
     * @author colg
     */
    public abstract Image createImage(String args);

    /**
     * 使用对象obj封装的数据创建图片
     *
     * @param obj
     * @return
     * @author colg
     */
    public abstract Image createImage(Object obj);
}
