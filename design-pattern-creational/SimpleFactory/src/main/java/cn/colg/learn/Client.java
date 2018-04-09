package cn.colg.learn;

import cn.hutool.setting.dialect.Props;

/**
 * 
 *
 * @author colg
 */
public class Client {

	public static void main(String[] args) {
		// 获取配置文件里的几何类型
		Props props = new Props("config.properties");
		String type = props.getStr("geometryType");

		// 通过工厂方法创建对象
		Geometry geometry = Geometry.getGeometry(type);
		geometry.dram();
		geometry.erase();
	}
}
