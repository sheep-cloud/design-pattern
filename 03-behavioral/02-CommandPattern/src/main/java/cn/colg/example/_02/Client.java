package cn.colg.example._02;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        FBSettingWindow fbsw = new FBSettingWindow().setTitle("功能键设置");
        
        FunctionButton fb1, fb2;
        fb1 = new FunctionButton().setName("功能键1");
        fb2 = new FunctionButton().setName("功能键1");
        
        AbstractCommand command1, command2;
        command1 = new HelpCommand();
        command2 = new MinimizeCommand();
        
        // 将命令注入功能键
        fb1.setCommand(command1);
        fb2.setCommand(command2);
        
        fbsw.addFunctionButton(fb1)
            .addFunctionButton(fb2);
        fbsw.display();
        
        // 调用功能键的业务方法
        fb1.onClick();
        fb2.onClick();
    }
}
