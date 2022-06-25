public class QuickSort {
    int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }
    public void quickSort() {
        quickSort(0, array.length - 1);
    }
    public void quickSort(int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(start, end);
        quickSort(0, pivot - 1);
        quickSort(pivot + 1, end);
    }
    private int partition(int start, int end) {
        int pIndex = start;
        int pivot = array[end];
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(i, pIndex);
                pIndex++;
            }
        }
        swap(pIndex, end);
        return pIndex;
    }
    private void swap(int location1, int location2) {
        int temp = array[location1];
        array[location1] = array[location2];
        array[location2] = temp;
    }
}
