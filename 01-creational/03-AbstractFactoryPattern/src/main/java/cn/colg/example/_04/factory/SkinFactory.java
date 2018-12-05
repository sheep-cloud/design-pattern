package cn.colg.example._04.factory;

import cn.colg.example._04.button.Button;
import cn.colg.example._04.select.Select;
import cn.colg.example._04.text.Text;

/**
 * 抽象工厂 - 界面皮肤工厂接口
 *
 * @author colg
 */
public interface SkinFactory {

    /**
     * 创建按钮
     *
     * @return
     * @author colg
     */
    Button createButton();

    /**
     * 创建文本框
     *
     * @return
     * @author colg
     */
    Text createText();

    /**
     * 创建下拉框
     *
     * @return
     * @author colg
     */
    Select createSelect();
}
