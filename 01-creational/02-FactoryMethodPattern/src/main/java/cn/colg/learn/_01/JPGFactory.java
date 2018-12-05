package cn.colg.learn._01;

/**
 * 具体工厂 - JPG图片工厂
 *
 * @author colg
 */
public class JPGFactory extends AbstractImageFactory {

    @Override
    public Image createImage() {
        // 使用默认方式创建图片
        Image image = new JPG();
        return image;
    }

    @Override
    public Image createImage(String args) {
        // 使用参数args创建图片
        Image image = new JPG();
        return image;
    }

    @Override
    public Image createImage(Object obj) {
        // 使用对象obj数据创建图片
        Image image = new JPG();
        return image;
    }
}