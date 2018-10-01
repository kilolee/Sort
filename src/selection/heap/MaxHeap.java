package selection.heap;

/**
 * Created by kilo on 2018/10/1.
 * 大根堆的基本性质
 * 用数组存储元素，从data[1]开始存储
 */
public class MaxHeap {
    private int[] data;
    private int count;
    private int capacity;

    /**
     * 构造函数，构造一个可以容纳capacity个元素的空堆
     *
     * @param capacity
     */
    public MaxHeap(int capacity) {
        data = new int[capacity + 1];
        this.count = 0;
        this.capacity = capacity;
    }

    /**
     * heapify过程创建堆
     * 构造函数，为长度为n的数组arr构造大根堆
     *
     * @param arr
     * @param n
     */
    public MaxHeap(int[] arr, int n) {
        data = new int[n + 1];
        this.capacity = n;
        for (int i = 0; i < n; i++)
            data[i + 1] = arr[i];
        count = n;
        //从最后一个非叶节点开始调整
        for (int i = n / 2; i > 0; i--) {
            shiftDown(i);
        }
    }

    /**
     * 返回堆中的元素个数
     *
     * @return
     */
    public int size() {
        return count;
    }

    /**
     * 返回一个布尔值, 表示堆中是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * 向最大堆中插入一个新的元素 item
     * 新元素可能会破坏堆的性质，调用shiftUp()调整新元素位置
     *
     * @param item
     */
    public void insert(int item) {
        assert count + 1 <= capacity;
        data[count + 1] = item;
        count++;
        shiftUp(count);
    }

    /**
     * 插入新元素后
     * 调整新元素data[k]的位置
     * 最大堆核心辅助函数
     *
     * @param k
     */
    private void shiftUp(int k) {
        while (k > 1 && data[k / 2] < data[k]) {
            swap(k, k / 2);
            k /= 2;
        }
    }

    /**
     * 从最大堆中取出堆顶元素, 即堆中所存储的最大数据
     *
     * @return
     */
    public int extractMax() {
        assert count > 0;
        int ret = data[1];
        swap(1, count);
        count--;
        shiftDown(1);
        return ret;
    }

    /**
     * 取出堆顶元素后
     * 调整新data[k]元素的位置,k=1
     *
     * @param k
     */
    private void shiftDown(int k) {
        while (2 * k <= count) {
            int j = 2 * k;
            if (j + 1 <= count && data[j] < data[j + 1])
                j++;
            //data[j]是data[2*k]和data[2*k+1]中的最大值
            if (data[k] >= data[j])
                break;
            swap(k, j);
            k = j;
        }
    }

    /**
     * 交换堆中索引为i和j的两个元素
     *
     * @param i
     * @param j
     */
    private void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}
