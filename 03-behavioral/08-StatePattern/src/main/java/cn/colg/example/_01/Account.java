package cn.colg.example._01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 账户类
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@Slf4j
public class Account {

    /** 状态 */
    private String state;
    /** 余额 */
    private double balance;

    /**
     * 存款操作
     *
     * @author colg
     */
    public void deposit() {
        // 存款
        stateCheck();
    }

    /**
     * 取款操作
     *
     * @author colg
     */
    public void withdraw() {
        if ("NormalState".equals(state) || "OverdraftState".equals(state)) {
            // 取款
            stateCheck();
        } else {
            // 取款受限
            log.info("取款受限");
        }
    }

    /**
     * 计算利息操作
     *
     * @author colg
     */
    public void computeInterest() {
        if ("OverdraftState".equals(state) || "RestrictedState".equals(state)) {
            // 计算利息
            log.info("计算利息");
        } else {
            log.info("不计算利息");
        }
    }

    /**
     * 状态检查和转换操作
     *
     * @author colg
     */
    public void stateCheck() {
        if (balance >= 0) {
            state = "NormalState";
        } else if (balance > -2000 && balance < 0) {
            state = "OverdraftState";
        } else if (balance == -2000) {
            state = "RestrictedState";
        } else if (balance < -2000) {
            // 操作受限
            log.info("操作受限");
        }
    }
}
