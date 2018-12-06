package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体装饰类 - 黑色边框装饰类
 *
 * @author colg
 */
@Slf4j
public class BlackBorderDecorator extends AbstractComponentDecorator {

    public BlackBorderDecorator(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    public void display() {
        super.display();
        this.setBlackBorder();
    }

    public void setBlackBorder() {
        log.info("为构件添加黑色边框");
    }
}
