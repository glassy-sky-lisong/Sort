package lisong.inter;

/**
 * @author : lisong
 * @date : 2019-10-26 21:22
 */
public interface RadixSort extends Sort{
    //基数排序
    int[] sortCore (int[] array, int maxDigit ,int currentDigit);

    int getDigit (int el, int currentDigit);
}
