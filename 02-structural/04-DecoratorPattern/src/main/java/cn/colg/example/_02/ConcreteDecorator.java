package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体装饰类
 * 
 * <pre>
 * 它是抽象装饰类的子类，负责向构件添加新的职责。
 * 每一个具体装饰类都定义了一些新的行为，它可以调用在抽象装饰类中定义的方法，并可以增加新的方法用以扩充对象的行为。
 * </pre>
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
