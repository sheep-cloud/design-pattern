package cn.colg.learn._01;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 代理主题角色 - 数学代理
 *
 * @author colg
 */
@Slf4j
public class ProxyMath implements Math {

    /** 维持一个真实主题对象 */
    private MathOperation mathOperation = new MathOperation();

    @Override
    public int div(int n, int m) {
        log.info("方法div()被调用，调用时间为 [{}]", DateUtil.now());
        int result = 0;
        try {
            result = mathOperation.div(n, m);
            log.info("方法div()调用成功，result : {}", result);
        } catch (Exception e) {
            log.info("方法div()调用失败");
        }
        return result;
    }
}
