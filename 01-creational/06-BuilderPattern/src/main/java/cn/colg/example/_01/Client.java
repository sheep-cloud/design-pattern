package cn.colg.example._01;

import cn.colg.util.IniUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        // example._01=cn.colg.example._01.ConcreteBuilder
        Builder builder = (Builder)IniUtil.getBean("example._01");
        
        Director director = new Director(builder);
        
        Product product = director.construct();
        log.info("product : {}", product);
    }
}
