package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品 - JPG图片
 *
 * @author colg
 */
@Slf4j
public class JPG implements Image {

    @Override
    public void readExtName() {
        log.info("读取JPG扩展名的图片");
    }
}
