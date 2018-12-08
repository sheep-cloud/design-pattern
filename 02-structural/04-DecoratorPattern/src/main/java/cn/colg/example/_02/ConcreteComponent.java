package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件类
 * 
 * <pre>
 * 它是抽象构件类的子类，用于定义具体的构件对象，实现了在抽象构件中声明的方法，装饰器可以给它增加额外的职责（方法）。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class ConcreteComponent extends AbstractComponent {

    @Override
    public void operation() {
        log.info("具体构件的业务方法");
    }
}
