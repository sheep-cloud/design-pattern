package cn.colg.example._01;

import lombok.Setter;

/**
 * 指挥者
 * 
 * <pre>
 * 指挥者又称为导演类，它负责安排复杂对象的建造次序，指挥者与抽象建造者之间存在关联关系，可以在其construct()建造方法中调用建造者对象的部件构造与装配方法，完成复杂对象的建造。
 * 客户端一般只需要与指挥者进行交互，在客户端确定具体建造者的类型，并实例化具体建造者对象（也可以通过配置文件和反射机制），然后通过指挥者类的构造函数或者Setter方法将该对象传入指挥者类中。
 * </pre>
 *
 * @author colg
 */
public class Director {

    /** 维持一个抽象建造者类型；设值注入；构造注入 */
    @Setter
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构建与组装方法
     *
     * @return
     * @author colg
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        return builder.getResult();
    }
}
