package cn.colg.example._02;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 具体原型类 - 工作周报WeeklyLog
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class WeeklyLog implements Cloneable {

    /** 姓名 */
    private String name;
    /** 周次 */
    private String date;
    /** 内容 */
    private String content;

    /**
     * 浅克隆；此处使用Java语言提供的克隆机制
     *
     * @return
     * @throws CloneNotSupportedException
     */
    public WeeklyLog shallowClone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return (WeeklyLog)obj;
    }
}
