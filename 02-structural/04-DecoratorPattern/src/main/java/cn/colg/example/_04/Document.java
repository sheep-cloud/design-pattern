package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件类 - 文件
 *
 * @author colg
 */
@Slf4j
public class Document extends AbstractComponent {

    @Override
    public void display() {
        log.info("文件的显示功能");
    }
}
