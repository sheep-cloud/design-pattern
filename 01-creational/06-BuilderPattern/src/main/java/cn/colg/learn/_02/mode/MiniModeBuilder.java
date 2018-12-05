package cn.colg.learn._02.mode;

import cn.colg.learn._02.Builder;
import cn.colg.learn._02.Video;

/**
 * 具体建造者 - 精简模式
 *
 * @author colg
 */
public class MiniModeBuilder implements Builder<Video> {

    @Override
    public Video build() {
        return new Video().setMainWindow("主窗口")
                          .setControlStrip("控制条");
    }
}
