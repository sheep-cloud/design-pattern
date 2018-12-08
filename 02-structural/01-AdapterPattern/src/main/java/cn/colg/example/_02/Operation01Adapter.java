package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配器类 - 操作适配器
 *
 * @author colg
 */
@Slf4j
public class Operation01Adapter implements ScoreOperation {

    /** 定义适配者QuickSort对象 */
    private QuickSort quickSort = new QuickSort();
    /** 定义适配者BinarySearch对象 */
    private BinarySearch binarySearch = new BinarySearch();

    @Override
    public int[] sort(int[] array) {
        // 调用适配器者QuickSort的排序方法
        log.info("调用适配器者QuickSort的排序方法");
        return quickSort.quickSort(array);
    }

    @Override
    public boolean search(int[] array, int key) {
        // 调用适配者类BinarySearch的二分查找方法
        log.info("调用适配者类BinarySearch的二分查找方法");
        return binarySearch.binarySearch(array, key);
    }
}
