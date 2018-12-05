package cn.colg.learn._01.mode;

import cn.colg.learn._01.AbstractVideoBuilder;

/**
 * 具体建造者 - 网络模式
 *
 * @author colg
 */
public class FullModeBuilder extends AbstractVideoBuilder {

    @Override
    public void buildMenu() {
        video.setMenu("菜单");
    }

    @Override
    public void buildPlayList() {
        video.setPlayList("播放列表");
    }

    @Override
    public void buildMainWindow() {
        video.setMainWindow("主窗口");
    }

    @Override
    public void buildControlStrip() {
        video.setControlStrip("控制条");
    }

    @Override
    public void buildFavoritesList() {}

}
