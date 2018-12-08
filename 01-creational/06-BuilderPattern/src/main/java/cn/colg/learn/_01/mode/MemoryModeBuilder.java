package cn.colg.learn._01.mode;

import cn.colg.learn._01.AbstractVideoBuilder;

/**
 * 具体建造者 - 记忆模式
 *
 * @author colg
 */
public class MemoryModeBuilder extends AbstractVideoBuilder {

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
    public void buildFavoritesList() {
        video.setControlStrip("收藏列表");
    }
}
