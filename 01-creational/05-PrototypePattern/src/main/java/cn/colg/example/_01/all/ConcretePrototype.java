package cn.colg.example._01.all;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 具体原型类
 * 
 * <pre>
 * 它实现在抽象原型类中声明的克隆方法，在克隆方法中返回自己的一个克隆对象。
 * </pre>
 *
 * @author colg
 */
@Getter
@Setter
@ToString
public class ConcretePrototype implements Prototype {

    /** 成员属性 */
    private String attr;

    @Override
    public Prototype shallowClone() {
        // 创建新对象
        ConcretePrototype prototype = new ConcretePrototype();
        // 将相关的参数传入新创建的对象中，保证它们的成员属性相同。
        prototype.setAttr(this.attr);
        return prototype;
    }
}
