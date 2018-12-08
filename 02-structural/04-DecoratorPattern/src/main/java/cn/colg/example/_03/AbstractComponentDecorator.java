package cn.colg.example._03;

/**
 * 抽象装饰类 - 构件装饰类
 *
 * @author colg
 */
public abstract class AbstractComponentDecorator extends AbstractComponent {

    /** 维持对抽象构件类型对象的引用；构造注入 */
    private AbstractComponent abstractComponent;

    public AbstractComponentDecorator(AbstractComponent abstractComponent) {
        this.abstractComponent = abstractComponent;
    }

    @Override
    public void display() {
        abstractComponent.display();
    }
}
