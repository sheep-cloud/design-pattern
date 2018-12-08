package cn.colg.example._03;

import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 抽象处理者 - 审批者类
 *
 * @author colg
 */
@ToString
@Accessors(chain = true)
public abstract class AbstractApprover {

    /** 定义后继对象；设值注入 */
    @Setter
    protected AbstractApprover successor;

    /** 审批者名称；构造注入 */
    protected String name;

    /**
     * 注入审批者名称
     *
     * @param name
     */
    public AbstractApprover(String name) {
        this.name = name;
    }

    /**
     * 抽象请求处理方法
     *
     * @param request
     * @author colg
     */
    public abstract void processRequest(PurchaseRequest request);
}
