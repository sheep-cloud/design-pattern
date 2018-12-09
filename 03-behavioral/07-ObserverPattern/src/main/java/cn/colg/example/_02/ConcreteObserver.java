package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体观察者
 * 
 * <pre>
 * 在具体观察者中维护一个指向具体目标对象的引用，它存储具体观察者的有关状态，这些状态需要和具体目标的状态保持一致；
 * 它实现了在抽象观察者Observer中定义的update()方法。
 * 通常在实现时，可以调用具体目标类的attach()方法将自己添加到目标类的集合中或通过detach()方法将自己从目标类的集合中删除。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class ConcreteObserver implements Observer {

    @Override
    public void update(AbstractSubject abstractSubject) {
        // 具体响应代码
        log.info("具体观察者 ConcreteObserver 的响应目标");
        abstractSubject.notifyObserver();
    }

    public void help() {
        log.info("支援方法");
    }
}
