package cn.colg.example._02;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标
 * 
 * <pre>
 * 目标又称为主题，它是指被观察的对象。
 * 在目标中定义了一个观察者集合，一个观察目标可以接受任意数量的观察者来观察，它提供一系列方法来增加和删除观察者对象，同时它定义了通知方法notify()。
 * 目标类可以是接口，也可以是抽象类或具体类。
 * </pre>
 *
 * @author colg
 */
public abstract class AbstractSubject {

    /** 定义一个观察者集合用于存储所有观察者对象 */
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 注册方法，用于向观察者集合中增加一个观察者
     *
     * @param observer
     * @author colg
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 注销方法，用于在观察者集合中删除一个观察者
     *
     * @param observer
     * @author colg
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 声明抽象通知方法
     * 
     * <pre>
     * notify() 关键字无法使用
     * </pre>
     *
     * @author colg
     */
    public abstract void notifyObserver();
}
