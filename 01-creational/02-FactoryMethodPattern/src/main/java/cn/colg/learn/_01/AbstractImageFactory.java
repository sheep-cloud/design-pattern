package cn.colg.learn._01;

/**
 * 抽象工厂 - 图片工厂
 *
 * @author colg
 */
public abstract class AbstractImageFactory {
    
    /**
     * 读取扩展名
     *
     * @author colg
     */
    public void readExtName() {
        Image image = this.createImage();
        image.readExtName();
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
