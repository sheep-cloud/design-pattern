package cn.colg.learn._01;

/**
 * 具体工厂 - JPG图片工厂
 *
 * @author colg
 */
public class JpgImageFactory extends AbstractImageFactory {

    @Override
    public Image createImage() {
        Image image = new JpgImage();
        // xxx
        return image;
    }

    @Override
    public Image createImage(String args) {
        Image image = new JpgImage();
        // xxx
        return image;
    }

    @Override
    public Image createImage(Object obj) {
        Image image = new JpgImage();
        // xxx
        return image;
    }
}
