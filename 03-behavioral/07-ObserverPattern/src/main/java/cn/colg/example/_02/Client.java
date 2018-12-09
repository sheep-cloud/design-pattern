package cn.colg.example._02;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractSubject subject = new ConcreteSubject();
        
        Observer observer1, observer2;
        observer1 = new ConcreteObserver();
        observer2 = new ConcreteObserver();
        
        subject.attach(observer1);
        subject.attach(observer2);
        
        observer1.update(subject);
    }
}
