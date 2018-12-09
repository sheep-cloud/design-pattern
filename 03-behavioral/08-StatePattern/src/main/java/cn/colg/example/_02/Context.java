package cn.colg.example._02;

import lombok.Getter;
import lombok.Setter;

/**
 * 环境类
 * 
 * <pre>
 * 环境类又称为上下文类，它是拥有多种状态的对象。
 * 由于环境类的状态存在多样性且在不同状态下对象的行为有所不同，因此将状态独立出去形成单独的状态类。
 * 在环境类中维护一个抽象状态类State的实例，这个实例定义当前状态，在具体实现时，它是一个State子类的对象。
 * </pre>
 *
 * @author colg
 */
@Getter
@Setter
public class Context {

    /** 维持一个抽象状态对象的引用；构造注入；设值注入 */
    private State state;

    /** 其他属性值，该属性值的变化可能会导致对象状态发生变化 */
    private int value;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        // 其他代码
        // 调用状态对象的业务方法
        state.handle();
        // 其他代码
    }

    /**
     * 统一由环境类来负责状态之间的转换
     *
     * @author colg
     */
    public void changeState() {
        // 判断属性值，根据所需薪资进行状态转换
        if (value == 0) {
            this.setState(new ConcreteStateA());
        } else if (value == 1) {
            this.setState(new ConcreteStateB());
        }
    }
}
