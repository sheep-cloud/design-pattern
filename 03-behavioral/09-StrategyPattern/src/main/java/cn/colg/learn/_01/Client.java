package cn.colg.learn._01;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft();
        Feature feature = (Feature)IniUtil.getBean("learn._01");
        // 注入飞机特征对象
        aircraft.setFeature(feature);
        aircraft.takeOff();
        aircraft.fly();
    }
}
