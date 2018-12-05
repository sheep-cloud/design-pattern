package cn.colg.example._02;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        Component composite1, composite2, composite3, leaf1, leaf2, leaf3, leaf4;
        composite1 = new Composite("Jax的资料");
        composite2 = new Composite("图像文件夹");
        composite3 = new Composite("文本文件夹");
        
        leaf1 = new Leaf("小龙女.jpg");
        leaf2 = new Leaf("张无忌.gif");
        
        leaf3 = new Leaf("九阴正经.txt");
        leaf4 = new Leaf("葵花宝典.txt");
        
        composite2.add(leaf1)
                  .add(leaf2);
        
        composite3.add(leaf3)
                  .add(leaf4);
        
        composite1.add(composite2)
                  .add(composite3);
        
        composite1.operation();
    }
}
