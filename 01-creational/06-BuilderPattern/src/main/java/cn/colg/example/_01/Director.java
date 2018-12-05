package cn.colg.example._01;

import lombok.Setter;

/**
 * 指挥者
 *
 * @author colg
 */
@Setter
public class Director {

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
        builder.buildPartC();
        return builder.getResult();
    }
}
