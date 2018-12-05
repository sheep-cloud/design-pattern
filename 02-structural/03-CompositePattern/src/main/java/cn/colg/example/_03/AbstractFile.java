package cn.colg.example._03;

/**
 * 抽象构件 - 抽象文件夹
 *
 * @author colg
 */
public abstract class AbstractFile {

    public abstract AbstractFile add(AbstractFile file);

    public abstract AbstractFile remove(AbstractFile file);

    public abstract AbstractFile getChild(int index);

    /**
     * 对构件进行杀毒
     *
     * @author colg
     */
    public abstract void killVirus();
}
