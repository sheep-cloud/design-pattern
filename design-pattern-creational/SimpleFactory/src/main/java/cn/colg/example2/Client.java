package cn.colg.example2;

/**
 * 客户端，调用方
 *
 * @author colg
 */
public class Client {

	public static void main(String[] args) {
		Product product;
		product = Factory.getProduct("A");// 通过工厂类创建产品对象
		product.methodSame();
		product.methodDiff();

		// 如果需要更换产品，只需修改静态工厂方法中的参数即可

		product = Factory.getProduct("B");// 通过工厂类创建产品对象
		product.methodSame();
		product.methodDiff();

		product = Factory.getProduct("xxxxxxxxxxx");// 通过工厂类创建产品对象
		product.methodSame();
		product.methodDiff();
	}
}
