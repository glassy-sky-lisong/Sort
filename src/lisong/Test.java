package lisong;

import lisong.inter.CountSort;
import lisong.inter.QuickSort;

import java.util.Map.Entry;

/**
 * @author : lisong
 * @date : 2019-10-24 10:59
 */
public class Test {

    public static void main(String[] args) {
//        int[] array = {1,4,5,8,3,6,9};
//        int[] array = {1,3,6,7,4,5,8,9};
        int[] array = {5,6,4,8,7,3,2};
//        int[] array = {2,4,2,3,7,1,1,0,0,5,6,9,8,5,7,4,0,9};
//        int[] array = {12,34,56,53,22,66};
        ShellSortImpl shellSort = new ShellSortImpl();
//        shellSort.sort(array);4 7 6 5 8 9 1
//        shellSort.print(array);
        QuickSortImpl quickSort = new QuickSortImpl();
        quickSort.sort(array);
        quickSort.print(quickSort.results);
    }
}

//123 456 667 482 515 536 514 532
//
//个位 1   2   3   4   5   6   7   8   9   0
//        482 123 514 515 456 667
//        532             536
//十位 1   2   3   4   5   6   7   8   9   0
//     514 123 532    456 667     482
//     515     536
//百位 1   2   3   4   5   6   7   8   9   0
//    123         456 514 667
//                482 515
//                    532
//                    536