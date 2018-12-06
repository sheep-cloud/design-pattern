package cn.colg.example._01;

/**
 * 抽象命令类
 * 
 * <pre>
 * 抽象命令类一般是一个抽象类或接口，在其中声明了用于执行请求的execute()等方法，通过这些方法可以调用请求接收者的相关操作。
 * </pre>
 *
 * @author colg
 */
public abstract class AbstractCommand {

    /**
     * 抽象执行请求方法
     *
     * @author colg
     */
    public abstract void execute();
}
