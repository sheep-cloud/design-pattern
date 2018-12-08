package cn.colg.learn._01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 客户类 - 抽象原型类可以是具体实现类
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Customer implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    /** 客户名称 */
    private String name;

    /** 客户地址 */
    private Address address;

    /**
     * 浅克隆
     *
     * @return
     * @throws CloneNotSupportedException
     * @author colg
     */
    public Customer shallowClone() throws CloneNotSupportedException {
        Customer customer = (Customer)super.clone();
        return customer;
    }

    /**
     * 深克隆
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     * @author colg
     */
    public Customer deepClone() throws IOException, ClassNotFoundException {
        // 写入对象
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        // 读取对象
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (Customer)ois.readObject();
    }
}
