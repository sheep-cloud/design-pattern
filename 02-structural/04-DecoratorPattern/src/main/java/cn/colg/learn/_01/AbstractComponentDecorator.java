package cn.colg.learn._01;

/**
 * 抽象构件装饰类
 *
 * @author colg
 */
public abstract class AbstractComponentDecorator extends AbstractComponent {

    /** 维持对抽象构件类型成员的引用；构造注入 */
    private AbstractComponent abstractComponent;

    public AbstractComponentDecorator(AbstractComponent abstractComponent) {
        this.abstractComponent = abstractComponent;
    }

    @Override
    public String crypoto(String data) {
        return abstractComponent.crypoto(data);
    }
}
