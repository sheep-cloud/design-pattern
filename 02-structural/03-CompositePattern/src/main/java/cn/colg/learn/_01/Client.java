package cn.colg.learn._01;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractComponent unit1, unit2, unit3, unit4;
        Form form1, form2;
        form1 = new Form("窗体_1");
        form2 = new Form("窗体_2");
        
        Panel panel1;
        panel1 = new Panel("面板_1");
        
        unit1 = new Button("按钮_1");
        unit2 = new Button("按钮_2");
        
        unit3 = new TextBox("文本框_1");
        unit4 = new TextBox("文本框_2");
        
        form2.add(unit1)
             .add(unit2)
             .add(unit3)
             .add(unit4);
        
        form1.add(form2)
             .add(panel1);
        
        form1.display();
    }
}
