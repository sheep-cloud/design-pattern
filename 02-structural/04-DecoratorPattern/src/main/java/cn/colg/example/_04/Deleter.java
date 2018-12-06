package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体装饰类 - 删除类
 *
 * @author colg
 */
@Slf4j
public class Deleter extends AbstractComponentDecorator {

    public Deleter(AbstractComponent abstractComponent) {
        super(abstractComponent);
        log.info("增加删除功能");
    }

    public void delete() {
        log.info("删除文件");
    }
}
