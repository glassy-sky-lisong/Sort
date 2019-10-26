package lisong;

import lisong.inter.RadixSort;

/**
 * @author : lisong
 * @date : 2019-10-25 12:56
 */
public class RadixSortImpl implements RadixSort {
    ShellSortImpl shellSort = new ShellSortImpl();
    @Override
    public int[] sortCore(int[] array, int maxDigit ,int currentDigit) {
        if (currentDigit > maxDigit){
            return array;
        }
        int[] count = new int[10];
        int[] results =new int[array.length];
        for (int i = 0,j=0; i < array.length; i++){
            int digit = getDigit(array[i],currentDigit);
            count[digit]++;
        }

        for (int i = 1; i < count.length; i++){
            count[i] = count[i] + count[i - 1];
        }

        for (int i = array.length-1; i >= 0; i--){
            results[--count[getDigit(array[i],currentDigit)]] = array[i];
        }

        return sortCore(results,maxDigit,currentDigit+1);
    }

    @Override
    public int getDigit(int el, int currentDigit) {
        int digit = (int) (el / Math.pow(10, currentDigit - 1));
        return digit%10;
    }

    @Override
    public void sort(int[] array) {
        int[] results = sortCore(array, 2,1);

        for (int i = 0; i < results.length; i++){
            array[i] = results[i];
        }
    }

    @Override
    public void swap(int[] array, int start, int end) {
        shellSort.swap(array,start,end);
    }

    @Override
    public void print(int[] array) {
        shellSort.print(array);
    }
}
