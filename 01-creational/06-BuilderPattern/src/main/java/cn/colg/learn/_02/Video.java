package cn.colg.learn._02;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 产品角色 - 视频播放软件
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Video {

    /** 菜单 */
    private String menu;
    /** 播放列表 */
    private String playList;
    /** 主窗口 */
    private String mainWindow;
    /** 控制条 */
    private String controlStrip;
    /** 收藏列表 */
    private String favoritesList;
}
