package cn.colg.example._01;

/**
 * 适配器类
 * 
 * <pre>
 * 适配器可以调用另一个接口，作为一个转换器，对Adaptee和Target进行适配，
 * 适配器类是适配器模式的核心，在对象适配器中，它通过继承Target并关联一个Adaptee对象使二者产生联系。
 * </pre>
 *
 * @author colg
 */
public class Adapter implements Target {

    /** 维持一个适配者类的引用 */
    private Adaptee adaptee = new Adaptee();

    @Override
    public void targetMethod() {
        adaptee.adapteeMethod();
    }
}
