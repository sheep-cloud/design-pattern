package cn.colg.util;

import cn.hutool.setting.dialect.Props;

/**
 * 配置文件操作类
 *
 * @author colg
 */
public class IniUtil {

    /** 配置文件路径 */
    public static final String PATH = "config.ini";

    /**
     * 读取配置文件中的参数
     *
     * @param key 配置文件的key
     * @return
     * @author colg
     */
    public static String getStr(String key) {
        Props props = new Props(PATH);
        return props.getStr(key);
    }

    /**
     * 该方法用于从ini配置文件中提取具体类名，并返回一个实例对象
     *
     * @param key 配置文件的key
     * @return
     * @author colg
     */
    public static Object getBean(String key) {
        String className = getStr(key);
        Object object = null;
        try {
            // 通过反射创建实例
            object = Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return object;
    }
}
