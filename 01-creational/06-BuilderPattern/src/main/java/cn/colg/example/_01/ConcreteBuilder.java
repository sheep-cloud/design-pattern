package cn.colg.example._01;

/**
 * 具体建造者
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
    public void buildPartC() {
        product.setPartC("partC");
    }

    @Override
    public Product getResult() {
        return product;
    }

}
