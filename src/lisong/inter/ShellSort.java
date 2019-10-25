package lisong.inter;

/**
 * @author : lisong
 * @date : 2019-10-25 01:59
 */
public interface ShellSort extends Sort{
    //选择排序
    void select (int[] array);
    //希尔排序
    void shell (int[] array);
}
