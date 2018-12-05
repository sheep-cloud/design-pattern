package cn.colg.example._04.factory;

import cn.colg.example._04.button.Button;
import cn.colg.example._04.button.SpringButton;
import cn.colg.example._04.select.Select;
import cn.colg.example._04.select.SpringSelect;
import cn.colg.example._04.text.SpringText;
import cn.colg.example._04.text.Text;

/**
 * 具体工厂
 *
 * @author colg
 */
public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public Text createText() {
        return new SpringText();
    }

    @Override
    public Select createSelect() {
        return new SpringSelect();
    }

}
