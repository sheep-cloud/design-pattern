package cn.colg.example._03;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        // 定义观察者目标对象
        AbstractAllyControlCenter acc = new ConcreteAllyControlCente("金庸群侠");
        
        // 定义4个观察者对象
        Observer player1, player2, player3, player4;
        player1 = new Player("杨过");
        player2 = new Player("令狐冲");
        player3 = new Player("张无忌");
        player4 = new Player("段誉");
        
        // 注册战队成员
        acc.join(player1)
           .join(player2)
           .join(player3)
           .join(player4);
        
        
        // 某成员遭受攻击
        player1.beAttacked(acc);
    }
}
