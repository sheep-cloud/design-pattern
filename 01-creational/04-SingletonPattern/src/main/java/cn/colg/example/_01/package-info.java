/**
 * 单例模式 （一）
 * 
 * <pre>
 * 为了实现Windows任务管理器的唯一性，通过如下三步来对该类进行重构：
 * 
 *  (1) 由于每次使用new关键字来实例化TaskManager类时都将产生一个新对象，为了确保TaskManager实例的唯一性，
 *      需要禁止类的外部直接使用new来创建对象，因此需要将TaskManager的构造函数的可见性改为private
 *      
 *  (2) 将构造函数改为private修饰后该如何创建对象呢？
 *      虽然类的外部无法再使用new来创建对象，但是在TaskManager的内部还是可以创建的；
 *      因此，可以在TaskManager中创建并保存这个唯一实例。需要在TaskManager中定义一个静态的TaskManager类型的私有成员变量。
 *      
 *  (3) 为了保证成员变量的封装性，我们将TaskManager类型的tm对象的可见性设置为private，但外界该如何使用该成员变量并何时实例化该成员变量呢？
 *      增加一个公有的静态方法
 * </pre>
 *
 * @author colg
 */
package cn.colg.example._01;