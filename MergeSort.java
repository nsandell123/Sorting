public class MergeSort {
    
    int[] array;

    public MergeSort(int[] array) {
        this.array = array;
    }

    public void mergeSort() {
        mergeSort(0, array.length - 1);
    }
    public void mergeSort(int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(l, mid);
        mergeSort(mid + 1, r);
        merge(l, mid, r);
    }
    public void merge(int l, int mid, int r) {
        int sizeOfLeft = mid - l + 1;
        int sizeOfRight = r - mid;

        int[] L = new int[sizeOfLeft];
        int[] R = new int[sizeOfRight];
        for (int i = l; i <= mid; i++) {
            L[i - l] = array[i];
        }
        for (int i = mid + 1; i <= r; i++) {
            R[i - mid - 1] = array[i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < sizeOfLeft && j < sizeOfRight) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            if (R[j] < L[i]) {
                array[k] = R[j];
                j++;
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




}
