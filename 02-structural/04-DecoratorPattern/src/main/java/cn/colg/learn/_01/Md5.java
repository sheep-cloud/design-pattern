package cn.colg.learn._01;

import cn.hutool.crypto.SecureUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件装饰类 - MD5
 *
 * @author colg
 */
@Slf4j
public class Md5 extends AbstractComponentDecorator {

    public Md5(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    public String crypoto(String data) {
        String result = super.crypoto(data);
        log.info("对字符串进行MD5加密 : {}", result);
        return SecureUtil.md5(result);
    }
}
