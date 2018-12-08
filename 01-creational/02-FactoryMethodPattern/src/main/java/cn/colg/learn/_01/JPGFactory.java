package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体工厂 - JPG图片工厂
 *
 * @author colg
 */
@Slf4j
public class JPGFactory extends AbstractImageFactory {

    @Override
    public Image createImage() {
        // 使用默认方式创建图片
        log.info("使用默认方式创建图片");
        return new JPG();
    }

    @Override
    public Image createImage(String args) {
        // 使用参数args创建图片
        log.info("使用参数args创建图片");
        return new JPG();
    }

    @Override
    public Image createImage(Object obj) {
        // 使用对象obj数据创建图片
        log.info("使用对象obj数据创建图片");
        return new JPG();
    }
}
