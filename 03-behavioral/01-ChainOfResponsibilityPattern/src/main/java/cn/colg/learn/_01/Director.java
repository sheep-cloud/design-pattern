package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者 - 主任类
 *
 * @author colg
 */
@Slf4j
public class Director extends AbstractApprover {

    @Override
    public void processLeave(Leave leave) {
        if (leave.getDay() < 3) {
            log.info("主任 [{}] 审批请假条 : {}", this.getName(), leave);
        } else {
            // 转发请求
            this.successor.processLeave(leave);
        }
    }
}
