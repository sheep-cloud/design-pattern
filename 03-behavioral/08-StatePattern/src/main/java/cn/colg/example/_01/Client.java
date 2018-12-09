package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        Account account = new Account().setBalance(-10000);
        // 存款
        account.deposit();
        // 取款
        account.withdraw();
        // 计算利息
        account.computeInterest();
        log.info("账户状态 : {}", account.getState());
    }
}
