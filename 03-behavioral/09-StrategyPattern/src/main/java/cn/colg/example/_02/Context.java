package cn.colg.example._02;

import lombok.Setter;

/**
 * 环境类
 * 
 * <pre>
 * 环境类是使用算法的角色，它在解决某个问题（即实现某个方法）时可以采用多种策略。
 * 在环境类中维持一个对抽象策略类的引用实例，用于定义所采用的策略。
 * </pre>
 *
 * @author colg
 */
public class Context {

    /** 维持一个抽象策略类的引用；设值注入 */
    @Setter
    private Strategy strategy;

    /**
     * 调用策略类中的算法
     *
     * @author colg
     */
    public void algorithm() {
        strategy.algorithm();
    }
}
