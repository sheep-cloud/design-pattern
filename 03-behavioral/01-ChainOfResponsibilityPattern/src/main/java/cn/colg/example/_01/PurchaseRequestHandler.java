package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 采购单处理类
 *
 * @author colg
 */
@Slf4j
public class PurchaseRequestHandler {

    /**
     * 递交采购单给主任
     *
     * @param request
     * @author colg
     */
    public void sendRequestToDirector(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            // 主任可审批该采购单
            this.handleByDirector(request);
        } else if (request.getAmount() < 100000) {
            // 副董事长可审批该采购单
            this.handleByVicePresident(request);
        } else if (request.getAmount() < 500000) {
            // 董事长可审批该采购单
            this.handleByPresident(request);
        } else {
            // 董事会可审批该采购单
            this.handleByCongress(request);
        }
    }

    private void handleByDirector(PurchaseRequest request) {
        log.info("主任审批 : {}", request);
    }

    private void handleByVicePresident(PurchaseRequest request) {
        log.info("副董事长审批: {}", request);
    }

    private void handleByPresident(PurchaseRequest request) {
        log.info("董事长审批: {}", request);
    }

    private void handleByCongress(PurchaseRequest request) {
        log.info("董事会审批: {}", request);
    }
}
