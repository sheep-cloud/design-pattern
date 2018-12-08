package cn.colg.example._02;

/**
 * 目标接口 - 抽象成绩操作类
 *
 * @author colg
 */
public interface ScoreOperation {

    /**
     * 成绩排序
     *
     * @param array
     * @return
     * @author colg
     */
    int[] sort(int array[]);

    /**
     * 成绩查找
     *
     * @param array
     * @param key
     * @return
     * @author colg
     */
    boolean search(int array[], int key);
}
