package cn.colg.example._01;

/**
 * 外观角色 - 外观
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
