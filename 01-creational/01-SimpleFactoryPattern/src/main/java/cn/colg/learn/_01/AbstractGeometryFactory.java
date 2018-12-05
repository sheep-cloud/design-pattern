package cn.colg.learn._01;

/**
 * 简化简单工厂模式：抽象产品角色（几何形状） + 工厂类
 *
 * @author colg
 */
public abstract class AbstractGeometryFactory {

    /**
     * 静态工厂方法；返回抽象产品类型
     *
     * @param type
     * @return
     * @author colg
     */
    public static AbstractGeometryFactory getGeometry(String type) {
        AbstractGeometryFactory geometry = null;
        if ("square".equals(type)) {
            geometry = new Square();
        } else if ("triangle".equals(type)) {
            geometry = new Triangle();
        } else if ("circular".equals(type)) {
            geometry = new Circular();
        }
        return geometry;
    }

    /**
     * 绘制
     *
     * @author colg
     */
    public abstract void draw();

    /**
     * 擦除
     *
     * @author colg
     */
    public abstract void erase();
}
