package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配器类 - 操作适配器
 *
 * @author colg
 */
@Slf4j
public class Operation01Adapter implements ScoreOperation {

    public Operation01Adapter() {
        log.info("创建操作适配器01");
    }

    @Override
    public int[] sort(int[] array) {
        // 调用适配器者QuickSort的排序方法
        return new QuickSort().quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        // 调用适配者类BinarySearch的二分查找方法
        return new BinarySearch().binarySearch(array, key);
    }
}
