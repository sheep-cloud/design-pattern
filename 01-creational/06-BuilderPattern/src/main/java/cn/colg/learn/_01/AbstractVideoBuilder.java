package cn.colg.learn._01;

/**
 * 抽象建造者 - 视频播放软件建造器
 *
 * @author colg
 */
public abstract class AbstractVideoBuilder {

    protected Video video = new Video();

    /**
     * 建造菜单
     *
     * @author colg
     */
    public abstract void buildMenu();

    /**
     * 建造播放列表
     *
     * @author colg
     */
    public abstract void buildPlayList();

    /**
     * 建造主窗口
     *
     * @author colg
     */
    public abstract void buildMainWindow();

    /**
     * 建造控制条
     *
     * @author colg
     */
    public abstract void buildControlStrip();

    /**
     * 建造收藏列表
     *
     * @author colg
     */
    public abstract void buildFavoritesList();

    /**
     * 返回一个完整的视频播放软件
     *
     * @return
     * @author colg
     */
    public Video construct() {
        this.buildMenu();
        this.buildPlayList();
        this.buildMainWindow();
        this.buildControlStrip();
        this.buildFavoritesList();
        return video;
    }
}
