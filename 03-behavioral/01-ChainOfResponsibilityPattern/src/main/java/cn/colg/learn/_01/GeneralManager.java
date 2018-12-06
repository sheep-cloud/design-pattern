package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者 - 总经理
 *
 * @author colg
 */
@Slf4j
public class GeneralManager extends AbstractApprover {

    @Override
    public void processLeave(Leave leave) {
        if (leave.getDay() < 30) {
            log.info("总经理 [{}] 审批请假条 : {}", this.getName(), leave);
        } else {
            // 超过30天，拒绝请求
            log.info("超过30天，总经理 [{}] 不能审批请假条 : {}，拒绝请假！", this.getName(), leave);
        }
    }
}
