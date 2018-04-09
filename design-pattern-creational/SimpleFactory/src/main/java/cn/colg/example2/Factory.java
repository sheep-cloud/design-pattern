package cn.colg.example2;

/**
 * 工厂角色
 *
 * @author colg
 */
public class Factory {

	/**
	 * 根据传入的不同参数创建不同的对象
	 * 
	 * @param arg
	 * @return
	 */
	public static Product getProduct(String arg) {
		Product product = null;
		if (arg.equalsIgnoreCase("A")) {
			product = new ConcrteProductA();
			// 初始化设置product
		} else if (arg.equalsIgnoreCase("B")) {
			product = new ConcrteProductB();
			// 初始化设置product
		} else {
			product = new ConcrteProduct();
		}
		return product;
	}
}
