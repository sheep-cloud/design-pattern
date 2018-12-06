package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件类 - 列表框类
 *
 * @author colg
 */
@Slf4j
public class ListBox extends AbstractComponent {

    @Override
    public void display() {
        log.info("显示列表框！");
    }
}
