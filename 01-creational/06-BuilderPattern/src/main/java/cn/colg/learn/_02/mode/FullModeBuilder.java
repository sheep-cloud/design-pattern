package cn.colg.learn._02.mode;

import cn.colg.learn._02.Builder;
import cn.colg.learn._02.Video;

/**
 * 具体建造者 - 完整模式
 *
 * @author colg
 */
public class FullModeBuilder implements Builder<Video> {

    @Override
    public Video build() {
        return new Video().setMenu("菜单")
                          .setPlayList("播放列表")
                          .setMainWindow("主窗口")
                          .setControlStrip("控制条");
    }
}
