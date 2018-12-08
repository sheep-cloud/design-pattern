package cn.colg.example._03;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        // 通过配置文件获取扩充抽象类
        AbstractImage image = (PNGImage)IniUtil.getBean("example._03_RefinedAbstraction");
        // 通过配置文件获取具体实现类
        ImageImp imp = (ImageImp)IniUtil.getBean("example._03_ConcreteImplementor");

        // 如果需要更换图像文件或者操作系统，只需要修改配置文件即可

        image.setImageImp(imp);
        image.parseFile("桥接模式");
    }
}
