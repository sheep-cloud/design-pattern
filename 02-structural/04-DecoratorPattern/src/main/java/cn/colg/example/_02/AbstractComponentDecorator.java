package cn.colg.example._02;

/**
 * 抽象装饰类
 * 
 * <pre>
 * 它也是抽象构件类的子类，用于给具体构件增加职责，但是具体职责在其子类中实现。
 * 它维护一个指向抽象构件对象的引用，通过该引用可以调用装饰之前构件对象的方法，并通过其子类扩展该方法，以达到装饰的目的。
 * </pre>
 *
 * @author colg
 */
public class AbstractComponentDecorator extends AbstractComponent {

    /** 维持一个对抽象构件对象的引用；构造注入 */
    private AbstractComponent component;

    public AbstractComponentDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 调用原有业务方法
        component.operation();
    }
}
