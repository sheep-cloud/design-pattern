package cn.colg.learn._02.mode;

import cn.colg.learn._02.Video;
import cn.hutool.core.lang.Builder;

/**
 * 具体建造者 - 记忆模式
 *
 * @author colg
 */
public class MemoryModeBuilder implements Builder<Video> {

    @Override
    public Video build() {
        return new Video().setMainWindow("主窗口")
                          .setControlStrip("控制条")
                          .setFavoritesList("收藏列表");
    }
}
