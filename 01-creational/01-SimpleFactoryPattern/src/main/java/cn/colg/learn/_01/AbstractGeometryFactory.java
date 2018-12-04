package cn.colg.learn._01;

/**
 * 简化简单工厂模式：抽象产品角色（几何形状） + 工厂类
 *
 * @author colg
 */
public abstract class AbstractGeometryFactory {

    public static AbstractGeometryFactory getGeometry(String type) {
        AbstractGeometryFactory geometry = null;
        if (type.equals("square")) {
            geometry = new Square();
        } else if (type.equals("triangle")) {
            geometry = new Triangle();
        } else if (type.equals("circular")) {
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
