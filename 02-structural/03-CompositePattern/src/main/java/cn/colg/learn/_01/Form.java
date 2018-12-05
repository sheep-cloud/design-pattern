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
 * 容器构件 - 窗体
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
public class Form extends AbstractComponent {

    /** 窗体名称 */
    private String name;

    /** 存储AbstractComponent类型的成员 */
    private List<AbstractComponent> forms = new ArrayList<>();

    public Form(String name) {
        this.name = name;
    }

    public Form add(AbstractComponent component) {
        forms.add(component);
        return this;
    }

    public Form remove(AbstractComponent component) {
        forms.remove(component);
        return this;
    }

    public AbstractComponent getChild(int index) {
        return forms.get(index);
    }

    @Override
    public void display() {
        log.info("窗体名称 : {}", name);

        // 递归调用成员构件的display()方法
        for (AbstractComponent component : forms) {
            component.display();
        }
    }
}
