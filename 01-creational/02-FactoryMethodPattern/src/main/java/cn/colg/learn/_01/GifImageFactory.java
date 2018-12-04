package cn.colg.learn._01;

/**
 * 具体工厂 - GIF图片工厂
 *
 * @author colg
 */
public class GifImageFactory extends AbstractImageFactory {

    @Override
    public Image createImage() {
        Image image = new GifImage();
        // xxx
        return image;
    }

    @Override
    public Image createImage(String args) {
        Image image = new GifImage();
        // xxx
        return image;
    }

    @Override
    public Image createImage(Object obj) {
        Image image = new GifImage();
        // xxx
        return image;
    }
}
