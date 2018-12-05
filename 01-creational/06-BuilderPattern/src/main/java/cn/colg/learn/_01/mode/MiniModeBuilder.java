package cn.colg.learn._01.mode;

import cn.colg.learn._01.AbstractVideoBuilder;

/**
 * 具体建造者 - 精简模式
 *
 * @author colg
 */
public class MiniModeBuilder extends AbstractVideoBuilder{

    @Override
    public void buildMenu() {}

    @Override
    public void buildPlayList() {}

    @Override
    public void buildMainWindow() {
        video.setMainWindow("主菜单");
    }

    @Override
    public void buildControlStrip() {
        video.setControlStrip("控制条");
    }

    @Override
    public void buildFavoritesList() {}

}
