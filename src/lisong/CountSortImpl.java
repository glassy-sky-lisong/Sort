package lisong;

import lisong.inter.CountSort;

/**
 * @author : lisong
 * @date : 2019-10-26 09:46
 */
public class CountSortImpl implements CountSort {
    ShellSortImpl shellSort = new ShellSortImpl();
    @Override
    public int[] countSort(int[] array) {
        int[] count = new int[10];
        int[] results = new int[array.length];

        for (int i = 0; i < array.length; i++){
            count[array[i]]++;
        }

        for (int i = 0 ,j = 0; i < count.length; i++){
            while (count[i]-- > 0) results[j++] = i;
        }

        return results;
    }

    @Override
    public void sort(int[] array) {
        int[] results = countSort(array);

        for (int i = 0; i < array.length; i++){
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
