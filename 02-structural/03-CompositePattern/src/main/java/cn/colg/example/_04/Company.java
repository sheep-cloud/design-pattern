package cn.colg.example._04;

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
 * 容器构件 - 公司
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
public class Company extends AbstractUnit {

    /** 公司名 */
    private String name;

    /** 用于存储AbstractUnit类型的成员 */
    private List<AbstractUnit> list = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public Company add(AbstractUnit unit) {
        list.add(unit);
        return this;
    }

    public Company remove(AbstractUnit unit) {
        list.remove(unit);
        return this;
    }

    public AbstractUnit getChild(int index) {
        return list.get(index);
    }

    @Override
    public void sendNotification() {
        log.info("公司[{}]发布通知", name);

        for (AbstractUnit abstractUnit : list) {
            abstractUnit.sendNotification();
        }
    }

}
