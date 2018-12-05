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

    /** 容器名称 */
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
        log.info("对容器[{}]进行杀毒", name);
        
        // 递归调用成员构件的业务方法
        for (Component component : list) {
            component.operation();
        }
    }

}
