package cn.colg.example._04;

import java.util.Observer;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AllyControlCente acc = new AllyControlCente("金庸群侠");

        Observer player1, player2, player3, player4;
        player1 = new Player("杨过");
        player2 = new Player("令狐冲");
        player3 = new Player("张无忌");
        player4 = new Player("段誉");

        acc.addObserver(player1);
        acc.addObserver(player2);
        acc.addObserver(player3);
        acc.addObserver(player4);

        player1.update(acc, null);
    }
}
