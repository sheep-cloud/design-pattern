package cn.colg.example._01;

/**
 * 扩充抽象类
 *
 * @author colg
 */
public class RefinedAbstraction extends AbstractAbstraction {

    @Override
    public void operation() {
        // 业务代码

        // 调用实现类的方法
        implementor.operationImpl();

        // 业务代码
    }

}
