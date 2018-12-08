package cn.colg.example._01;

/**
 * 具体建造者
 * 
 * <pre>
 * 它实现了Builder接口，实现各个部件的具体构造和装配方法，定义并明确它所创建的复杂对象，也可以提供一个方法返回创建好的复杂产品对象。
 * </pre>
 *
 * @author colg
 */
public class ConcreteBuilder implements Builder {

    // 创建产品对象
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("partB");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
