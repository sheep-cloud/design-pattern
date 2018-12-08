package cn.colg.example._02;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {

    public static void main(String[] args) {
        AbstractProduct product;
        // 通过工厂类创建产品对象
        product = Factory.getProduct("");
        product.methodSame();
        product.methodDiff();

        /*
         * colg  [简单工厂模式（二）]
         * 
         *  如果需要更换产品，只需修改静态工厂方法中的参数即可
         */

        product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();

        product = Factory.getProduct("B");
        product.methodSame();
        product.methodDiff();

        product = Factory.getProduct("xxxxxxxxxxx");
        product.methodSame();
        product.methodDiff();
    }
}
