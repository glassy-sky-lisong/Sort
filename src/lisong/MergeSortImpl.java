package lisong;

import lisong.inter.MergeSort;
import lisong.inter.ShellSort;

import java.util.List;

/**
 * @author : lisong
 * @date : 2019-10-24 16:22
 */
public class MergeSortImpl implements MergeSort {
    ShellSort shellSort = new ShellSortImpl();

    @Override
    public void sort(int[] array) {
        shellSort.sort(array);
        if (array.length%2 == 0){
            mergeO(array);
        }else {
            mergeJ(array);
        }
    }

    @Override //1 4 5 8 3 6 9
    public void mergeJ(int[] array) {
        int mid = array.length/2;
        int[] temp = new int[array.length];

        int first = 0;
        int last = mid + 1;
        int tempkey = 0;

        while (first <= mid && last < array.length){
            //int[] array = {7,6,5,8,4,9,1,3};
            //4 7 6 5 8 9 1 3
            if (array[first] < array[last]){
                temp[tempkey++] = array[first++];
            }else {
                temp[tempkey++] = array[last++];
            }
        }

        while (first <= mid) temp[tempkey++] = array[first++];
        while (last < array.length) temp[tempkey++] = array[last++];

        print(temp);

        array = temp;
    }

    @Override
    public void mergeO(int[] array) {
        int mid = array.length/2;
        int[] temp = new int[array.length];

        int first = 0;
        int last = (mid + 1) - 1;
        int tempkey = 0;

        while (first < mid && last < array.length){
            //int[] array = {1 3 6 7 4 5 8 9};
            //1 3 6 7 4 5 8 9     1 3 4 5 6 7
            if (array[first] < array[last]){
                temp[tempkey++] = array[first++];
            }else {
                temp[tempkey++] = array[last++];
            }
        }

        while (first < mid) temp[tempkey++] = array[first++];
        while (last < array.length) temp[tempkey++] = array[last++];

//        print(temp);

//        array = temp;
        //将排序好的数据重新赋值给array
        for (int i = 0; i < temp.length; i++){
            array[i] = temp[i];
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
