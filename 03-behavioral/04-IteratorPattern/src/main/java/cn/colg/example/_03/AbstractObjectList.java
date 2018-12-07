package cn.colg.example._03;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象聚合类
 *
 * @author colg
 */
@Getter
@Setter
public abstract class AbstractObjectList {

    protected List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    /**
     * 声明创建迭代器对象的抽象工厂方法
     *
     * @return
     * @author colg
     */
    public abstract Iterator createIterator();

}
