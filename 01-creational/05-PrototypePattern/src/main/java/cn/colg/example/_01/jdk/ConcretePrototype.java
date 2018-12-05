package cn.colg.example._01.jdk;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 具体原型类
 *
 * @author colg
 */
@Getter
@Setter
@ToString
public class ConcretePrototype implements Prototype, Cloneable {

    /** 成员属性 */
    private String attr;

    @Override
    public Prototype shallowClone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return (Prototype)obj;
    }
}
