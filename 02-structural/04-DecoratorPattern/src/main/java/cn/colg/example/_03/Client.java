package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        // 使用抽象构件定义
        AbstractComponent component, componentSB;
        // 定义具体构件
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();
        log.info("----------------------------------------------------------------------------------------------------");

        /// 得到一个既有滚动条又有黑色边框的窗体，不需要对原有类库进行任何修改

        // 将装饰了一次之后的对象继续注入到另一个装饰类中，进行第二次装饰
        AbstractComponent componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();

        /// 透明装饰模式，使用抽象构件定义，无法调用具体装饰类单独的方法
        // componentBB.setBlackBorder();
    }
}
