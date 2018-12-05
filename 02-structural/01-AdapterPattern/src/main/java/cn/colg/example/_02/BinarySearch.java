package cn.colg.example._02;

/**
 * 适配者类 - 二分查找类
 *
 * @author colg
 */
public class BinarySearch {

    /**
     * 二分查找法
     *
     * @param array
     * @param key
     * @return
     * @author colg
     */
    public int binarySearch(int array[], int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                // 找到元素返回1
                return 1;
            }
        }

        // 未找到元素返回-1
        return -1;

        // return Arrays.binarySearch(array, key);
    }
}
