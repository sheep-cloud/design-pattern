package cn.colg.example._01.all;

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
public class ConcretePrototype implements Prototype {

    /** 成员属性 */
    private String attr;

    @Override
    public Prototype shallowClone() {
        // 克隆新对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr(this.attr);
        return prototype;
    }

}
