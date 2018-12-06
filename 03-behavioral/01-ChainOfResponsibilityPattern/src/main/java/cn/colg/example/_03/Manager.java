package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者 - 经理类
 *
 * @author colg
 */
@Slf4j
public class Manager extends AbstractApprover {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 80000) {
            log.info("经理 [{}] 审批采购单 : {}", this.name, request);
        } else {
            // 转发请求
            this.successor.processRequest(request);
        }
    }
}
