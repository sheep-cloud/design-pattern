package cn.colg.learn._01;

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
 * 容器构件 - 面板
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
public class Panel extends AbstractComponent {

    /** 面板名称 */
    private String name;

    /** 存储AbstractComponent类型的成员 */
    private List<AbstractComponent> panels = new ArrayList<>();

    public Panel(String name) {
        this.name = name;
    }

    public Panel add(AbstractComponent component) {
        panels.add(component);
        return this;
    }

    public Panel remove(AbstractComponent component) {
        panels.remove(component);
        return this;
    }

    public AbstractComponent getChild(int index) {
        return panels.get(index);
    }

    @Override
    public void display() {
        log.info("面板名称 : {}", name);

        // 递归调用成员构件的display()方法
        for (AbstractComponent component : panels) {
            component.display();
        }
    }
}
