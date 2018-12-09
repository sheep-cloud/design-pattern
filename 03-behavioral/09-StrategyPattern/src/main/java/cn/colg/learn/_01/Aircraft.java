package cn.colg.learn._01;

import lombok.Setter;

/**
 * 环境类 - 飞机
 *
 * @author colg
 */
public class Aircraft {

    /** 维持一个抽象飞机特征对象的引用；设值注入 */
    @Setter
    private Feature feature;

    public void takeOff() {
        // 调用飞机特征对象的方法
        feature.takeOff();
    }

    public void fly() {
        // 调用飞机特征对象的方法
        feature.fly();
    }
}
