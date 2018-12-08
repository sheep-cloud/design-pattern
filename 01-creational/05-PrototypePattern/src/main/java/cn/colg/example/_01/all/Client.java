package cn.colg.example._01.all;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 * 
 * <pre>
 * 让一个原型对象克隆自身从而创建一个新的对象，
 * 在客户类中只需要直接实例化或通过工厂方法等方式创建一个原型对象，再通过调用该对象的克隆方法即可得到多个相同的对象。
 * 由于客户类针对抽象原型类Prototype编程，因此用户可以根据需要选择具体原型类，系统具有较好的可扩展性，增加或更换具体原型类都很方便。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        ConcretePrototype obj1, obj2;
        obj1 = new ConcretePrototype();
        obj1.setAttr("Colg");
        
        obj2 = (ConcretePrototype)obj1.shallowClone();
        log.info("obj1 == obj2 : {}", obj1 == obj2);
        log.info("obj1 : {}", obj1);
        log.info("obj2 : {}", obj2);
    }
}
