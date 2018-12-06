package cn.colg.example._03;

/**
 * 抽象装饰类 - 构件装饰类
 *
 * @author colg
 */
public abstract class AbstractComponentDecorator extends AbstractComponent {

    /** 维持对抽象构件类型对象的引用 */
    private AbstractComponent abstractComponent;

    /**
     * 注入抽象构件类型的对象
     *
     * @param abstractComponent
     */
    public AbstractComponentDecorator(AbstractComponent abstractComponent) {
        this.abstractComponent = abstractComponent;
    }

    @Override
    public void display() {
        abstractComponent.display();
    }

}
