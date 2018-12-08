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
    }

    @Override
    public void display() {
        super.display();
        this.delete();
    }

    public void delete() {
        log.info("删除文件");
    }
}
