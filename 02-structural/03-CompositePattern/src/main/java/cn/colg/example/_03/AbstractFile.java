package cn.colg.example._03;

/**
 * 抽象构件 - 抽象文件夹
 *
 * @author colg
 */
public abstract class AbstractFile {

    /**
     * 添加构件
     *
     * @param file
     * @return
     * @author colg
     */
    public abstract AbstractFile add(AbstractFile file);

    /**
     * 删除构件
     *
     * @param file
     * @return
     * @author colg
     */
    public abstract AbstractFile remove(AbstractFile file);

    /**
     * 获取构件
     *
     * @param index
     * @return
     * @author colg
     */
    public abstract AbstractFile getChild(int index);

    /**
     * 对构件进行杀毒
     *
     * @author colg
     */
    public abstract void killVirus();
}
