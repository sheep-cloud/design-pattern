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

    public Operation02Adapter() {
        log.info("创建操作适配器02");
    }

    @Override
    public int[] sort(int[] array) {
        // 调用适配者类BubbleSort的冒牌排序方法
        return new BubbleSort().bubbleSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        // 调用适配者类 ArrayUtil的查找方法
        boolean exists = ArrayUtil.contains(array, key);
        return exists ? 1 : -1;
    }

}
