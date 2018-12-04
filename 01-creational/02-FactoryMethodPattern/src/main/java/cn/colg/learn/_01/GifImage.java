package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品 - GIF图片
 *
 * @author colg
 */
@Slf4j
public class GifImage implements Image {

    public GifImage() {
        log.info("创建GIF格式图片");
    }

    @Override
    public void readExtName() {
        log.info("读取GIF扩展名的图片");
    }
}
