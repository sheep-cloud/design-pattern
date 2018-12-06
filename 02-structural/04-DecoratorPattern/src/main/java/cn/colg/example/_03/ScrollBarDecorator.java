package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体装饰类 - 滚动条装饰类
 *
 * @author colg
 */
@Slf4j
public class ScrollBarDecorator extends AbstractComponentDecorator {

    public ScrollBarDecorator(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    public void display() {
        super.display();
        this.setScrollBar();
    }

    private void setScrollBar() {
        log.info("为构件添加滚动条");
    }
}
