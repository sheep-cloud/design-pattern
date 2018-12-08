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
 * <pre>
 * 它在组合结构中表示叶子节点对象，叶子节点没有子节点，它实现了在抽象构件中定义的行为。
 * 对于那些访问及管理子构件的方法，可以通过异常等方式进行处理。
 * </pre>
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

    /** 叶子名称；构造注入 */
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
        log.info("对叶子 [{}] 进行杀毒", name);
    }
}
