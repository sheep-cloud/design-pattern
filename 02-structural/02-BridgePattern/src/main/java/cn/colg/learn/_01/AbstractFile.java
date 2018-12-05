package cn.colg.learn._01;

import lombok.Setter;

/**
 * 抽象类 - 抽象文件类
 *
 * @author colg
 */
@Setter
public abstract class AbstractFile {

    /** 定义实现类接口对象 */
    protected Db db;

    /**
     * 解析数据
     *
     * @param data
     * @author colg
     */
    public abstract void parseData(Data data);
}
