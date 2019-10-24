package lisong.inter;

/**
 * @author : lisong
 * @date : 2019-10-24 10:36
 */
public interface Sort {
    //排序
     void sort(int[] array);
    //交换
     void swap(int[] array ,int start ,int end);
    //输出
     void print(int [] array);
     //选择排序
    void select(int[] array);
}
