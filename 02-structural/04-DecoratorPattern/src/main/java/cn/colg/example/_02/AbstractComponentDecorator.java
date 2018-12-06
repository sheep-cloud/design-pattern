package cn.colg.example._02;

/**
 * 抽象装饰类
 *
 * @author colg
 */
public class AbstractComponentDecorator extends AbstractComponent {

    /** 维持一个对抽象构件对象的引用 */
    private AbstractComponent component;

    /**
     * 注入一个抽象构建类型的对象
     *
     * @param component
     */
    public AbstractComponentDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 调用原有业务方法
        component.operation();
    }

}
