package cn.colg.example._02;

import cn.hutool.core.util.ArrayUtil;

/**
 * 适配者类 - 冒泡排序类
 *
 * @author colg
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param array
     * @return
     * @author colg
     */
    public int[] bubbleSort(int array[]) {
        for (int i = 0, len = array.length - 1; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayUtil.swap(array, j, j + 1);
                }
            }
        }
        return array;
    }

}
