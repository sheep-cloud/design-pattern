package cn.colg.example._02;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 容器构件
 * 
 * <pre>
 * 它在组合结构中表示容器节点对象，容器节点包含子节点，其子节点可以是叶子节点，也可以是容器节点，它提供一个集合用于存储子节点，实现了在抽象构件中定义的行为，
 * 包括那些访问及管理子构件的方法，在其业务方法中可以递归调用其子节点的业务方法。
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
public class Composite implements Component {

    /** 容器名称；构造注入 */
    private String name;

    /** 用于存储构件 */
    private List<Component> list = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public Component add(Component c) {
        list.add(c);
        return this;
    }

    @Override
    public Component remove(Component c) {
        list.remove(c);
        return this;
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        // 容器构件具体业务方法的实现
        log.info("对容器 [{}] 进行杀毒", name);
        
        // 递归调用成员构件的业务方法
        for (Component component : list) {
            component.operation();
        }
    }

}
