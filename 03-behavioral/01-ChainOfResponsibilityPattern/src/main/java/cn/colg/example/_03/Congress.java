package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者 - 董事会类
 *
 * @author colg
 */
@Slf4j
public class Congress extends AbstractApprover {

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        log.info("召开董事会 [{}] 审批采购单 : {}", this.name, request);
    }
}
