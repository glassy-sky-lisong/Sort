package lisong;

import lisong.inter.QuickSort;
import lisong.inter.ShellSort;

/**
 * @author : lisong
 * @date : 2019-10-27 17:58
 */
public class QuickSortImpl implements QuickSort {
    ShellSort shellSort = new ShellSortImpl();
    int[] results;
    boolean isRight = true;
    @Override
    public void quickSort(int[] array, int left, int right) {
        int i=left;
        int j=right;
        int temp=array[left];
        if(left>=right) return;
        while(i!=j) {
        while(i<j&&array[j]>=temp) j--;
        if(j>i) array[i]=array[j];//a[i]已经赋值给temp,所以直接将a[j]赋值给a[i],赋值完之后a[j],有空位
        while(i<j&&array[i]<=temp) i++;
        if(i<j) array[j]=array[i];
        }
        array[i]=temp;//把基准插入,此时i与j已经相等R[low..pivotpos-1].keys≤R[pivotpos].key≤R[pivotpos+1..high].keys
        quickSort(array,left,i-1);/*递归左边*/
        quickSort(array,i+1,right);/*递归右边*/

        if (results ==null){
            results = new int[array.length];
        }
        for (int t=0;t<array.length;t++){
            results[t]=array[t];
        }
}

    @Override
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
//        for (int i = 0; i < array.length; i++){
//            array[i] = results[i];
//        }
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
