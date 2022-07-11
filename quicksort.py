class quicksort:

    def __init__(self, array):
        self.array = array
    def partition(self, left, right):
        pivot = self.array[right]
        boundarySwap = left
        for i in range(left, right):
            if self.array[i] <= pivot:
                temp = self.array[boundarySwap]
                self.array[boundarySwap] = self.array[i]
                self.array[i] = temp
                boundarySwap += 1
        temp = self.array[boundarySwap]
        self.array[boundarySwap] = self.array[right]
        self.array[right] = temp
        return boundarySwap

    def quicksortHelper(self, left, right):
        if (left < right):
            pivotIndex = self.partition(left, right)
            self.quicksortHelper(left, pivotIndex - 1)
            self.quicksortHelper(pivotIndex + 1, right)
    def quicksort(self):
        self.quicksortHelper(0, len(self.array) - 1)

    def print_array(self):
        for i in self.array:
            print(i, end =" ")
