package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者类 - 副董事长
 *
 * @author colg
 */
@Slf4j
public class VicePresident extends AbstractApprover {

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            log.info("副董事长 [{}] 审批采购单 : {}", this.name, request);
        } else {
            // 转发请求
            this.successor.processRequest(request);
        }
    }
}
