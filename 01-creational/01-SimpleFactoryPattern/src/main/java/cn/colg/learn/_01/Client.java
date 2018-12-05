package cn.colg.learn._01;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractGeometryFactory geometry;
        String type = IniUtil.getStr("learn._01");
        geometry = AbstractGeometryFactory.getGeometry(type);
        geometry.draw();
        geometry.erase();
    }
}
