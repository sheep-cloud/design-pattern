package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体状态类 - 透支状态
 *
 * @author colg
 */
@Slf4j
public class OverdraftState extends AbstractAccountState {

    public OverdraftState(AbstractAccountState accountState) {
        this.account = accountState.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        log.info("计算利息！");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setAccountState(new NormalState(this));
        } else if (account.getBalance() == -2000) {
            account.setAccountState(new RestrictedState(this));
        } else if (account.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }
}
