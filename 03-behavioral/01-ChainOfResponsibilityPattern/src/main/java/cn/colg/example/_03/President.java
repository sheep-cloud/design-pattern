package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者 - 董事长类
 *
 * @author colg
 */
@Slf4j
public class President extends AbstractApprover {

    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            log.info("董事长 [{}] 审批采购单 : {}", this.name, request);
        } else {
            // 转发请求
            this.successor.processRequest(request);
        }

    }

}
