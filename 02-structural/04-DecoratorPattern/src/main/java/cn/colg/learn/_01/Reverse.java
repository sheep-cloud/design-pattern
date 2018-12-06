package cn.colg.learn._01;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件装饰类 - 逆向
 *
 * @author colg
 */
@Slf4j
public class Reverse extends AbstractComponentDecorator {

    public Reverse(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    public String crypoto(String data) {
        String result = super.crypoto(data);
        log.info("对字符串进行逆向加密");
        return StrUtil.reverse(result);
    }
}
