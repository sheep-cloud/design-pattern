package cn.colg.example._03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 请求类 - 采购单
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PurchaseRequest {

    /** 采购金额 */
    private double amount;
    /** 采购单编号 */
    private int number;
    /** 采购目的 */
    private String purpose;
}
