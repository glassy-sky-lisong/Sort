package lisong;

import lisong.inter.ShellSort;
import lisong.inter.Sort;

/**
 * @author : lisong
 * @date : 2019-10-24 10:34
 */
public class ShellSortImpl implements ShellSort {
    @Override
    public void sort(int[] array) {
        this.shell(array);
        this.select(array);
    }

    @Override
    public void shell(int[] array) {
        //希尔分组间隔为garp
        for (int garp = array.length/2; garp > 1; garp/=2){
            for (int i = garp; i < array.length; i++){
                for (int j = i; j > garp - 1; j-=garp){
                    if (array[j] < array[j-garp]){
                        //交换数组元素
                        swap(array,j,j-garp);
                    }
                }
            }
        }
    }

    @Override
    public void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    @Override
    public void print(int[] array) {
        for (int i=0; i<array.length; i++){
            System.out.println("第"+i+"个元素的值是："+array[i]);
        }
    }

    @Override
    public void select(int[] array) {
        for (int i = 1; i<array.length; i++){
            if (array[i] < array[i-1]){
                swap(array,i,i-1);
            }
        }
    }

}
