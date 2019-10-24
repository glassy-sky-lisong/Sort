package lisong;

import lisong.inter.MergeSort;

import java.util.List;

/**
 * @author : lisong
 * @date : 2019-10-24 16:22
 */
public class MergeSortImpl implements MergeSort {
    ShellSort shellSort = new ShellSort();
    @Override
    public void merge(int[] array) {
        int mid = array.length/2;
        int[] temp = new int[array.length];

        int first = 0;
        int last = mid + 1;
        int tempkey = 0;

        while (first <= mid && last <= array.length){
            if (array[first] < array[last]){
                array[tempkey++] = array[first++];
            }else {
                array[tempkey++] = array[last++];
            }
        }

        while (first <= mid) array[tempkey] = array[first];
        while (last <= array.length) array[tempkey] = array[last];

        print(temp);

        array = temp;
    }

    @Override
    public void sort(int[] array) {
        this.merge(array);
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
