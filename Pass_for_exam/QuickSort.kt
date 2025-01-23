public class QuickSort() {

    fun quickSort(array: IntArray): IntArray {

        fun partition(array: IntArray, low: Int, high: Int): Int {
            val pivot = array[high]
            var i = low - 1
            for (j in low until high) {
                if (array[j] < pivot) {
                    i++
                    val temp = array[i]
                    array[i] = array[j]
                    array[j] = temp
                }
            }
            val temp = array[i + 1]
            array[i + 1] = array[high]
            array[high] = temp
            return i + 1
        }

        fun quickSortHelper(array: IntArray, low: Int, high: Int) {
            if (low < high) {
                val pi = partition(array, low, high)
                quickSortHelper(array, low, pi - 1)
                quickSortHelper(array, pi + 1, high)
            }
        }

        quickSortHelper(array, 0, array.size - 1)
        return array
    }
}
