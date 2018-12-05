package cn.colg.learn._01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 叶子构件 - 单元控件（按钮）
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Slf4j
public class Button extends AbstractComponent {

    /** 按钮名称 */
    private String name;

    @Override
    public void display() {
        log.info("显示按钮 : {}", name);
    }
}
