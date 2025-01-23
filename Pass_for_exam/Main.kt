
fun main(){
    val array = intArrayOf(64, 34, 25, 12, 22, 11, 90)

    val bubbleSort = BubbleSort()
    val heapSort = HeapSort()
    val insertionSort = InsertionSort()
    val mergeSort = MergeSort()
    val quickSort = QuickSort()


    println("Original Array: ${array.joinToString(", ")}")

    println("Bubble Sort: ${bubbleSort.bubbleSort(array.copyOf()).joinToString(", ")}")
    println("Insertion Sort: ${insertionSort.insertionSort(array.copyOf()).joinToString(", ")}")
    println("Quick Sort: ${quickSort.quickSort(array.copyOf()).joinToString(", ")}")
    println("Merge Sort: ${mergeSort.mergeSort(array.copyOf()).joinToString(", ")}")
    println("Heap Sort: ${heapSort.heapSort(array.copyOf()).joinToString(", ")}")
}
