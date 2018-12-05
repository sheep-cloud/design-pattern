package cn.colg.example._04.factory;

import cn.colg.example._04.button.Button;
import cn.colg.example._04.button.SummerButton;
import cn.colg.example._04.select.Select;
import cn.colg.example._04.select.SummerSelect;
import cn.colg.example._04.text.SummerText;
import cn.colg.example._04.text.Text;

/**
 * 具体工厂
 *
 * @author colg
 */
public class SummerSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public Text createText() {
        return new SummerText();
    }

    @Override
    public Select createSelect() {
        return new SummerSelect();
    }

}
