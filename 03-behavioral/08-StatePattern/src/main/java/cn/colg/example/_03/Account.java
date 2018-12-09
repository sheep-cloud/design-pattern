package cn.colg.example._03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 环境类 - 银行账户
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Slf4j
public class Account {

    /** 维持一个抽象状态对象的引用 */
    private AbstractAccountState accountState;

    /** 开户名 */
    private String owner;
    /** 账户余额 */
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        // 设置初始状态
        this.accountState = new NormalState(this);
        log.info("{} 开户，初始金额为 : {}", owner, balance);
        log.info("----------------------------------------------------------------------------------------------------");
    }

    public void deposit(double amount) {
        log.info("{} 存款 : {}", this.owner, amount);
        // 用状态对象的deposit()方法
        accountState.deposit(amount);
        log.info("现在余额为 : {}", this.balance);
        log.info("现在账户状态为 : {}", this.accountState.getClass().getSimpleName());
        log.info("----------------------------------------------------------------------------------------------------");
    }

    public void withdraw(double amount) {
        log.info("{} 取款 : {}", this.owner, amount);
        // 调用状态对象的withdraw()方法
        accountState.withdraw(amount);
        log.info("现在余额为 : {}", this.balance);
        log.info("现在账户状态为 : {}", this.accountState.getClass().getSimpleName());
        log.info("----------------------------------------------------------------------------------------------------");
    }

    public void computeInterest() {
        // 调用状态对象的computeInterest()方法
        accountState.computeInterest();
    }
}
