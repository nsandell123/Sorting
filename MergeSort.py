class MergeSort:

    def __init__(self, array):
        self.array = array
    def merge(self, left, mid, right):
        left_subarray =self.array[left:mid+1]
        right_subarray =self.array[mid+1:right+1]


        i = 0
        j = 0
        k = left
        while i < len(left_subarray) or j < len(right_subarray):
            if i == len(left_subarray):
                self.array[k] = right_subarray[j]
                j += 1
            elif j == len(right_subarray):
                self.array[k] = left_subarray[i]
                i += 1
            elif right_subarray[j] < left_subarray[i]:
                self.array[k] = right_subarray[j]
                j += 1
            elif left_subarray[i] <= right_subarray[j]:
                self.array[k] = left_subarray[i]
                i += 1
            k += 1

    def mergeSort(self, left=0, right=4):
        if (left >= right):
            return
        mid = left + (right - left) // 2
        self.mergeSort(left, mid)
        self.mergeSort(mid + 1, right)

        self.merge(left, mid, right)

    def print_array(self):
        print(self.array)





