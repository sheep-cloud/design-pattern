package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体装饰类
 *
 * @author colg
 */
@Slf4j
public class ConcreteDecorator extends AbstractComponentDecorator {

    public ConcreteDecorator(AbstractComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        // 调用原有业务方法
        super.operation();
        // 调用新增业务方法
        this.addedBehavior();
    }

    /**
     * 新增业务方法
     *
     * @author colg
     */
    private void addedBehavior() {
        log.info("具体装饰类新增了业务方法");
    }
}
