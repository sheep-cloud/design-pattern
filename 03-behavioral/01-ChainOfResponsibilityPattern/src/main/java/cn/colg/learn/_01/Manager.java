package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者 - 经理
 *
 * @author colg
 */
@Slf4j
public class Manager extends AbstractApprover {

    @Override
    public void processLeave(Leave leave) {
        if (leave.getDay() < 10) {
            log.info("经理 [{}] 审批采购单 : {}", this.getName(), leave);
        } else {
            // 转发请求
            this.successor.processLeave(leave);
        }
    }
}
