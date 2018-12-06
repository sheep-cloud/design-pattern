package cn.colg.example._04;

import cn.colg.example._03.AbstractComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件类 - 请假条
 *
 * @author colg
 */
@Slf4j
public class LeaveRequest extends AbstractComponent {

    @Override
    public void display() {
        log.info("请假条的显示功能");
    }
}
