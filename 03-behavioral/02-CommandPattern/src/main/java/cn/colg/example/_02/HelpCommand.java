package cn.colg.example._02;

/**
 * 具体命令类 - 帮助命令类
 *
 * @author colg
 */
public class HelpCommand extends AbstractCommand {

    /** 维持对请求接收者的引用 */
    private HelpHandler helpHandler = new HelpHandler();

    @Override
    public void execute() {
        helpHandler.display();
    }

}
