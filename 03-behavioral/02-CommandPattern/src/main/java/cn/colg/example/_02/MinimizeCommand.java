package cn.colg.example._02;

/**
 * 具体命令类 - 最小化命令类
 *
 * @author colg
 */
public class MinimizeCommand extends AbstractCommand {

    /** 维持对接收请求者的引用 */
    private WindowHanlder windowHanlder = new WindowHanlder();

    @Override
    public void execute() {
        windowHanlder.minimize();
    }
}
