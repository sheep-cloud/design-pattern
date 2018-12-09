package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体状态类 - 受限状态
 *
 * @author colg
 */
@Slf4j
public class RestrictedState extends AbstractAccountState {

    public RestrictedState(AbstractAccountState accountState) {
        this.account = accountState.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        log.info("帐号受限，取款失败！");
    }

    @Override
    public void computeInterest() {
        log.info("计算利息！");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setAccountState(new NormalState(this));
        } else if (account.getBalance() > -2000) {
            account.setAccountState(new OverdraftState(this));
        }
    }
}
