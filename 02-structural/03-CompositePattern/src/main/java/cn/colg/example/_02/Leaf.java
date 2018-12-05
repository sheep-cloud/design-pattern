package cn.colg.example._02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 叶子构件
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
public class Leaf implements Component {

    /** 叶子名称 */
    private String name;

    @Override
    public Component add(Component c) {
        // 异常处理或错误提示
        return null;
    }

    @Override
    public Component remove(Component c) {
        // 异常处理或错误提示
        return null;
    }

    @Override
    public Component getChild(int i) {
        // 异常处理或错误提示
        return null;
    }

    @Override
    public void operation() {
        // 叶子构件具体业务方法的实现
        log.info("对叶子[{}]进行杀毒", name);
    }

}
