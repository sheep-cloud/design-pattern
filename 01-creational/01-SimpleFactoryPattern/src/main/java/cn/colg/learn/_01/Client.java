package cn.colg.learn._01;

import cn.hutool.setting.dialect.Props;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {

    public static void main(String[] args) {
        AbstractGeometryFactory geometry;

        // 读取配置文件中的参数
        String type = new Props("geometry.properties").getStr("geometryType");

        geometry = AbstractGeometryFactory.getGeometry(type);
        geometry.draw();
        geometry.erase();
    }
}
