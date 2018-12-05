package cn.colg.example._02;

import java.util.Arrays;

/**
 * 适配者类 - 快速排序类
 *
 * @author colg
 */
public class QuickSort {

    /**
     * 快速排序
     *
     * @param array
     * @return
     * @author colg
     */
    public int[] quickSort(int array[]) {
        Arrays.sort(array);
        return array;
    }
}
