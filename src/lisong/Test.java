package lisong;

/**
 * @author : lisong
 * @date : 2019-10-24 10:59
 */
public class Test {

    public static void main(String[] args) {
        int[] array = {7,6,5,8,4,9,1,3};
//        ShellSort shellSort = new ShellSort();
//        shellSort.sort(array);
//        shellSort.select(array);
//        shellSort.print(array);

        MergeSortImpl mergeSort = new MergeSortImpl();
        mergeSort.sort(array);
        mergeSort.print(array);
    }
}
