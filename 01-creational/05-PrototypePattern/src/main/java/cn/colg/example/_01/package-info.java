/**
 * 原型模式（一）
 * 
 * <pre>
 * 1. 通用实现方法
 * 
 *  通用的克隆实现方法是在具体原型类的克隆方法中实例化一个与自身类型相同的对象并将其返回，并将相关的参数传入新创建的对象中，保证它们的成员属性相同。
 *  
 * 2. Java语言提供的clone()方法
 * 
 *  所有的Java类都继承自java.lang.Object。
 *  事实上，Object类提供一个clone()方法，可以将一个Java对象复制一份。
 *  因此在Java中可以直接使用Object提供的clone()方法来实现对象的克隆，Java语言中的原型模式实现很简单。
 * </pre>
 *
 * @author colg
 */
package cn.colg.example._01;