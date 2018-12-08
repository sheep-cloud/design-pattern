package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配者类
 * 
 * <pre>
 * 适配者即被适配的角色，它定义了一个已经存在的接口，这个接口需要适配，适配者类一般是一个具体类，包含了客户希望使用的业务方法，在某些情况下可能没有适配者类的源代码。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class Adaptee {

    public void adapteeMethod() {
        log.info("适配者类的业务方法");
    }
}
