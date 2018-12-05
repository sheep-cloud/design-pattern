package cn.colg.example._01.all;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
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
