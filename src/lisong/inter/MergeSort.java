package lisong.inter;

/**
 * @author : lisong
 * @date : 2019-10-24 16:18
 */
public interface MergeSort extends Sort{
    //归并（当arr.length是奇数时）
    void mergeJ (int[] array);

    //归并（当arr.length是偶数时）
    void mergeO (int[] array);

}
