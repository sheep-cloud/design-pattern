package cn.colg.example._01;

import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 调用者
 * 
 * <pre>
 * 调用者即请求发送者，它通过命令对象来执行请求。
 * 一个调用者并不需要在设计时确定其接收者，因此它只与抽象命令类之间存在关联关系。
 * 在程序运行时可以将一个具体命令对象注入其中，再调用具体命令对象的execute()方法，从而实现间接调用请求接收者的相关操作。
 * </pre>
 *
 * @author colg
 */
@Accessors(chain = true)
public class Invoker {

    /** 维持抽象命令类型成员的引用；设值注入 */
    @Setter
    private AbstractCommand command;

    /**
     * 业务方法，用于调用命令类的execute()方法
     *
     * @author colg
     */
    public void call() {
        command.execute();
    }
}
