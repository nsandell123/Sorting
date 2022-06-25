import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      // write your code here
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 4;
        array[2] = 3;
        array[3] = 2;
        array[4] = 1;

        //QuickSort sorting = new QuickSort(array);
        //sorting.quickSort();

        MergeSort sorting = new MergeSort(array);
        sorting.mergeSort();

        System.out.println(Arrays.toString(array));
    }



}
