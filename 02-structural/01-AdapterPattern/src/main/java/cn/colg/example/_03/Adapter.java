package cn.colg.example._03;

/**
 * 适配器类 - 类适配器
 *
 * @author colg
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void targetMethod() {
        // 调用适配者类的方法
        adapteeMethod();
    }
}
