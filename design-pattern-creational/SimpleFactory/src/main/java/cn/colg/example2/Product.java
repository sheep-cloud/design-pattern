package cn.colg.example2;

/**
 * 抽象产品角色
 *
 * @author colg
 */
public abstract class Product {

	// 所有产品类的公共业务方法
	public void methodSame() {
		// 公共方法的实现
		System.out.println("Product.methodSame()");
	}

	// 声明抽象业务方法
	public abstract void methodDiff();
}
