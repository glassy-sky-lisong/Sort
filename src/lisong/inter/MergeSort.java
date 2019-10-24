package lisong.inter;

/**
 * @author : lisong
 * @date : 2019-10-24 16:18
 */
public interface MergeSort {
    //归并
    void merge (int[] array);
    //排序
    void sort (int[] array);
    //交换
    void swap (int[] array ,int start ,int end);
    //打印
    void print (int[] array);
}
