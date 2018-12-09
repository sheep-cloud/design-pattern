package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体状态类 - 正常状态
 *
 * @author colg
 */
@Slf4j
public class NormalState extends AbstractAccountState {

    public NormalState(Account account) {
        this.account = account;
    }

    public NormalState(AbstractAccountState accountState) {
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
        log.info("正常状态，无须支付利息！");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > -2000 && account.getBalance() <= 0) {
            account.setAccountState(new OverdraftState(this));
        } else if (account.getBalance() == -2000) {
            account.setAccountState(new RestrictedState(this));
        } else if (account.getBalance() < -2000) {
            log.info("操作受限！");
        }
    }

}
