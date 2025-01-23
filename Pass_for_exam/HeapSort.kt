public class HeapSort {
    fun heapSort(array: IntArray): IntArray {
        val n = array.size

        fun heapify(array: IntArray, n: Int, i: Int) {
            var largest = i
            val left = 2 * i + 1
            val right = 2 * i + 2

            if (left < n && array[left] > array[largest]) largest = left
            if (right < n && array[right] > array[largest]) largest = right

            if (largest != i) {
                val swap = array[i]
                array[i] = array[largest]
                array[largest] = swap
                heapify(array, n, largest)
            }
        }

        for (i in n / 2 - 1 downTo 0) heapify(array, n, i)
        for (i in n - 1 downTo 1) {
            val temp = array[0]
            array[0] = array[i]
            array[i] = temp
            heapify(array, i, 0)
        }
        return array
    }
}
