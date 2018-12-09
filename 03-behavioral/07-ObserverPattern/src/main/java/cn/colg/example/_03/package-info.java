/**
 * 观察者模式（三）
 * 
 * <pre>
 * 完整解决方案
 * 
 * 软件公司开发人员决定使用观察者模式来进行多人联机对战游戏的设计
 * 
 * 在本实例中，实现了两次对象之间的联动，
 * 当一个游戏玩家Player对象的beAttacked()方法被调用时，将调用AllyControlCenter的notifyObserver()方法来进行处理，
 * 而在notifyObserver()方法中又将调用其他Player对象的help()方法。
 * Player的beAttacked()方法、AllyControlCenter的notifyObserver()方法以及Player的help()方法构成了一个联动触发链，
 * </pre>
 *
 * @author colg
 */
package cn.colg.example._03;