package cn.colg.example._01;

/**
 * 外观角色 - 外观
 * 
 * <pre>
 * 在客户端可以调用它的方法，在外观角色中可以知道相关的（一个或者多个）子系统的功能和责任；
 * 在正常情况下，它将所有从客户端发来的请求委派到相应的子系统去，传递给相应的子系统对象处理。
 * </pre>
 *
 * @author colg
 */
public class Facade {

    /*
     * colg  [外观角色]
     * 
     *  外观角色维持对子系统对象的引用
     *  
     *  客户端可以通过外观类来间接调用子系统对象的业务方法，而无须与子系统对象直接交互。
     */

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void method() {
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
