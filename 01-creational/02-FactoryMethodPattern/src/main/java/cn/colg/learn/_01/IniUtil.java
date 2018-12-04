package cn.colg.learn._01;

import cn.hutool.setting.dialect.Props;

/**
 * Ini配置文件操作类
 *
 * @author colg
 */
public class IniUtil {

    /**
     * 该方法用于从ini配置文件中提取具体类名，并返回一个实例对象
     *
     * @return
     * @author colg
     */
    public static Object getBean() {
        // 读取配置文件里的参数 cn.colg.learn._01.GifImageFactory
        String factoryName = new Props("learn.ini").getStr("imageFactoryName");

        Object object = null;
        try {
            // 通过反射创建实例
            object = Class.forName(factoryName).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return object;
    }
}
