import java.util.*;


class scratch {
    public static void mergeSort(int[] array, int left, int right, Map<Integer, Integer> map) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left )/2;
        mergeSort(array, left, mid, map);
        mergeSort(array, mid + 1, right, map);

        int sizeOfLeft = mid - left + 1;
        int sizeOfRight = right - mid;

        int[] L = new int[sizeOfLeft];
        int[] R = new int[sizeOfRight];
        for (int i = left; i <= mid; i++) {
            L[i - left] = array[i];
        }
        for (int i = mid + 1; i <= right; i++) {
            R[i - mid - 1] = array[i];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < sizeOfLeft && j < sizeOfRight) {
            System.out.println(sizeOfLeft);
            System.out.println(sizeOfRight);
            System.out.println(j);
            System.out.println(i);
            if (L[i] <= R[j]) {
                System.out.println("here 1");
                array[k] = L[i];
                i++;
            } else if (R[j] < L[i]) {
                System.out.println("here 2");
                array[k] = R[j];
                j++;
                map.put(R[j], map.get(R[j]) + 1);
            }
            k++;
        }
        while (i < sizeOfLeft) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < sizeOfRight) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // A utility function to print an array of size n
    static void printArr(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int arr[] = {2, 1, 3};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(2, 0);
        map.put(1, 0);
        map.put(3, 0);
        mergeSort(arr, 0, 2, map);

    }
}
