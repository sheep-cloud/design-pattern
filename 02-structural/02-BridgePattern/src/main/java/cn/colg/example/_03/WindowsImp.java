package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现类 - Windows操作系统实现类
 *
 * @author colg
 */
@Slf4j
public class WindowsImp implements ImageImp {

    @Override
    public void doPaint(Matrix matrix) {
        log.info("在Windows操作系统中显示图像 : {}", matrix);
    }
}
