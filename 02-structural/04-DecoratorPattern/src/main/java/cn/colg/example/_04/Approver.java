package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体装饰类 - 审批类
 *
 * @author colg
 */
@Slf4j
public class Approver extends AbstractComponentDecorator {

    public Approver(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    public void display() {
        super.display();
        this.approve();
    }

    public void approve() {
        log.info("审批文件！");
    }
}
