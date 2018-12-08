package cn.colg.learn._01;

import cn.hutool.crypto.SecureUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件装饰类 - Sha1
 *
 * @author colg
 */
@Slf4j
public class Sha1 extends AbstractComponentDecorator {

    public Sha1(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    public String crypoto(String data) {
        String result = super.crypoto(data);
        log.info("对字符串进行SHA1加密 : {}", result);
        return SecureUtil.sha1(result);
    }
}
