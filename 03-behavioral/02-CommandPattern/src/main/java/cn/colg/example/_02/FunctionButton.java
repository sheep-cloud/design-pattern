package cn.colg.example._02;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 调用者 - 功能键类
 *
 * @author colg
 */
@Accessors(chain = true)
@Slf4j
public class FunctionButton {

    /** 功能键名称 */
    @Getter
    @Setter
    private String name;

    /** 维持一个抽象命令对象的引用；设值注入 */
    @Setter
    private AbstractCommand command;

    /**
     * 发送请求的方法
     *
     * @author colg
     */
    public void onClick() {
        log.info("点击功能键");
        command.execute();
    }
}