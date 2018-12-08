package cn.colg.example._02;

import cn.hutool.core.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 适配器类 - 操作适配器02
 *
 * @author colg
 */
@Slf4j
public class Operation02Adapter implements ScoreOperation {
    
    /** 定义适配者BubbleSort对象 */
    private BubbleSort bubbleSort = new BubbleSort();

    @Override
    public int[] sort(int[] array) {
        // 调用适配者类BubbleSort的冒泡排序方法
        log.info("调用适配者类BubbleSort的冒泡排序方法");
        return bubbleSort.bubbleSort(array);
    }

    @Override
    public boolean search(int[] array, int key) {
        // 调用适配者类 ArrayUtil的查找方法
        log.info("调用适配者类 ArrayUtil的查找方法");
        return ArrayUtil.contains(array, key);
    }

}
