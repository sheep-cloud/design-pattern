package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者 - 主任类
 *
 * @author colg
 */
@Slf4j
public class Director extends AbstractApprover {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            log.info("主任 [{}] 审批采购单 : {}", this.name, request);
        } else {
            // 转发请求
            this.successor.processRequest(request);
        }
    }
}
